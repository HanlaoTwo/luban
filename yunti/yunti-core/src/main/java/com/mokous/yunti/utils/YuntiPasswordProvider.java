//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.utils;

import com.mokous.db.utils.PasswordProvider;

/**
 * @author luofei
 * Generate 2020/2/2
 */
public class YuntiPasswordProvider {
    private PasswordProvider passwordProvider;
    private String name;

    public String getPassword() {
        return passwordProvider.getPassword(name);
    }

    public PasswordProvider getPasswordProvider() {
        return passwordProvider;
    }

    public void setPasswordProvider(PasswordProvider passwordProvider) {
        this.passwordProvider = passwordProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
