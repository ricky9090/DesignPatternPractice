package com.pattern.abstractfactory.iphone;

import com.pattern.abstractfactory.SmartPhone;

public class IPhoneX implements SmartPhone {
    @Override
    public String getSystemInfo() {
        return "iPhone X iOS 12";
    }
}
