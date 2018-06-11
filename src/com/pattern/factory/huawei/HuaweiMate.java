package com.pattern.factory.huawei;

import com.pattern.factory.SmartPhone;

public class HuaweiMate implements SmartPhone {
    @Override
    public String getSystemInfo() {
        return "Mate10 EMUI 9.0";
    }
}
