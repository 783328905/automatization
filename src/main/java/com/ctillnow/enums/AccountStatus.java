package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

/**
 * Created by xiezongyu on 2017/11/10.
 */
public enum AccountStatus implements HasDefaultInterface<AccountStatus> {
    unknown(-1),
    normal(1),
    logout(2);

    private Integer value;

    AccountStatus(Integer value) {
        this.value = value;
    }

    @Override
    public AccountStatus getDefault() {
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public static AccountStatus valueOf(Integer value){
        for(AccountStatus accountStatus : AccountStatus.values()) {
            if(accountStatus.getValue().equals(value)) {
                return accountStatus;
            }
        }
        throw new IllegalArgumentException("unknown AccountStatus value:" + value);
    }

}
