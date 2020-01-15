package com.ctillnow.robot.mobile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import scala.util.parsing.combinator.testing.Str;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by caiping on 2020/1/9.
 * 需要为每台mobile创建一个appium,通过电脑控制appium，进而控制手机
 */
@Component
public class AppiumHelper {
    private static final Logger logger = LoggerFactory.getLogger(AppiumHelper.class);

    public static void killAppium(Integer port){
        String pid = getPid("127.0.0.1", port);
        String commond_kill_pid = "cmd /c taskKill /f /t /pid %s";
        Process process = null;
        BufferedReader bufferedReader = null;
        try {
            process = Runtime.getRuntime().exec(String.format(commond_kill_pid, pid));
            bufferedReader = new BufferedReader(new InputStreamReader( process.getInputStream()));
            String s = "";
            while ((s = bufferedReader.readLine()) != null){
                logger.debug(s);
            }
            logger.info("kill process pid:{}",pid);
        } catch (IOException e) {
            logger.error("fail to kill process, port", port);
        } finally {
            if(process != null) {
                process.destroy();
            }
        }


    }
    private static String getPid(String host, Integer port){
        Process process = null;
        BufferedReader bufferedReader = null;
        String commond_get_pid = "cmd /c netstat -ano | findstr .*%s:%s.*";
        try {
            process = Runtime.getRuntime().exec(String.format(commond_get_pid, host, port));
            bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                logger.info("task list:" + s);
                String[] splits = s.split("LISTENING");
                if (splits.length == 2)
                    return splits[1].trim();
            }
        } catch (IOException e) {
            logger.error("fail to execute this commond get pid in port {}", port, e);
        }finally {
            try {
                if(bufferedReader != null) {
                    bufferedReader.close();
                }
                if(process != null){
                    process.destroy();
                }
            } catch (IOException e) {
                logger.error("fail to close bufferReader",e);
            }

        }
        return null;
    }

    public static void startAppium(Integer port) {
        Process process = null;
        BufferedReader bufferedReader = null;
        String cmd = String.format("cmd /c appium -a %s -p %s", "127.0.0.1", port);
        try {
             process = Runtime.getRuntime().exec(cmd);
             bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = bufferedReader.readLine()) != null){
                logger.debug(s);
            }
        } catch (IOException e) {
            logger.error("fail to execute this commond start appium in port {}",port,e);
        }
    }

    public static void main(String[] args) throws IOException {
        startAppium(4723);
        //System.out.println(getPid("127.0.0.1",4723));
        // killAppium(4723);
    }

}
