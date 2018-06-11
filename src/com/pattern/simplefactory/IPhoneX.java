package com.pattern.simplefactory;

public class IPhoneX implements SmartPhone {
    @Override
    public String getSystemInfo() {
        return "iPhone X iOS 12";
    }
}
