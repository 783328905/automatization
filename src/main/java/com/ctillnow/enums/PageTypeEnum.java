package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

/**
 * Created by caiping on 2020/1/6.
 */
public enum  PageTypeEnum implements HasDefaultInterface<PageTypeEnum> {
    single(1),
    list(2);
    private Integer value;

    PageTypeEnum(int value){
        this.value = value;
    }

    @Override
    public PageTypeEnum getDefault() {
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

}
