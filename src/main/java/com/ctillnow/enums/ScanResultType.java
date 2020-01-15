package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

/**
 * Created by xiezongyu on 2017/11/10.
 */
public enum ScanResultType implements HasDefaultInterface<ScanResultType> {

    unknown(-1),
    wechat_groups(1),
    person_account(2),
    official_account(3),
    h5(4),
    wechat_groups_joined(5),
    person_account_joined(6),
    official_account_joined(7),
    operation_frequent(8),
    other(9),
    duplicated(10),
    ;


    private Integer value;

    ScanResultType(Integer value) {
        this.value=value;
    }

    @Override
    public ScanResultType getDefault() {
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
