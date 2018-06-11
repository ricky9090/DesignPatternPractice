package com.pattern.factory;

import com.pattern.factory.huawei.HuaweiPhoneFactory;
import com.pattern.factory.iphone.IPhoneFactory;
import com.pattern.factory.oppo.OppoFactory;

public class TestMain {
    public static void main(String[] args) {
        SmartPhone oppo = new OppoFactory().producePhone();
        System.out.println(oppo.getSystemInfo());

        SmartPhone huawei = new HuaweiPhoneFactory().producePhone();
        System.out.println(huawei.getSystemInfo());

        SmartPhone iphonex = new IPhoneFactory().producePhone();
        System.out.println(iphonex.getSystemInfo());
    }
}
