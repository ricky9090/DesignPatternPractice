package com.pattern.factory.iphone;

import com.pattern.factory.SmartPhone;

public class IPhoneX implements SmartPhone {
    @Override
    public String getSystemInfo() {
        return "iPhone X iOS 12";
    }
}
