//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.sql;

/**
 * @author luofei
 * Generate 2020/1/31
 */
public class DatabaseContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDBKey(String dataSourceKey) {
        contextHolder.set(dataSourceKey);
    }

    public static String getDBKey() {
        return contextHolder.get();
    }

    public static void clearDBKey() {
        contextHolder.remove();
    }
}
