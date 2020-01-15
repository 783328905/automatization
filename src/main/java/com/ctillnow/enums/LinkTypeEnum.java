package com.ctillnow.enums;


import com.ctillnow.util.intf.HasDefaultInterface;

public enum LinkTypeEnum implements HasDefaultInterface<LinkTypeEnum> {
    LINK(1),
    POSTER(2),
    QRCODE(3),
    ;

    private Integer value;
    LinkTypeEnum(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public LinkTypeEnum getDefault() {
        return LINK;
    }

    public static LinkTypeEnum valueOf (Integer value){
        for (LinkTypeEnum linkType : LinkTypeEnum.values()) {
            if (linkType.value.equals(value)){
                return linkType;
            }
        }
        throw new IllegalArgumentException("unknown LinkTypeEnum value:" + value);
    }
}
