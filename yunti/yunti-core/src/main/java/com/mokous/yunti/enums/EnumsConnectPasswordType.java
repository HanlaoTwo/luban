//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.enums;

/**
 * @author luofei
 * Generate 2020/1/31
 */
public enum EnumsConnectPasswordType {
    DIRECT_PASSWORD("password", "直接密码连接"), PROVIDER_PASSWORD("provider", "直接密码连接");
    private String value;
    private String info;

    EnumsConnectPasswordType(String value, String info) {
        this.value = value;
        this.info = info;
    }

    public static EnumsConnectPasswordType enumByValue(String value) {
        for (EnumsConnectPasswordType enumsConnectPasswordType : EnumsConnectPasswordType.values()) {
            if (enumsConnectPasswordType.value.equalsIgnoreCase(value)) {
                return enumsConnectPasswordType;
            }
        }
        return DIRECT_PASSWORD;
    }

    public String getValue() {
        return value;
    }

    public String getInfo() {
        return info;
    }
}
