package com.pattern.simplefactory;

public class HuaweiMate implements SmartPhone {
    @Override
    public String getSystemInfo() {
        return "Mate10 EMUI 9.0";
    }
}
