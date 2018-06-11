package com.pattern.abstractfactory.huawei;

import com.pattern.abstractfactory.SmartPhone;

public class HuaweiMate implements SmartPhone {
    @Override
    public String getSystemInfo() {
        return "Mate10 EMUI 9.0";
    }
}
