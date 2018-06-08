package com.pattern.factory;

public class TestMain {
    public static void main(String[] args) {
        SmartPhone oppo = SmartPhoneFactory.createSmartPhone(OppoR15.class);
        System.out.println(oppo.getSystemInfo());

        SmartPhone huawei = SmartPhoneFactory.createSmartPhone(HuaweiMate.class);
        System.out.println(huawei.getSystemInfo());

        SmartPhone iphonex = SmartPhoneFactory.createSmartPhone(IPhoneX.class);
        System.out.println(iphonex.getSystemInfo());
    }
}
