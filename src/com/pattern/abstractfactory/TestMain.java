package com.pattern.abstractfactory;

import com.pattern.abstractfactory.huawei.HuaweiFactory;
import com.pattern.abstractfactory.iphone.AppleFactory;
import com.pattern.abstractfactory.oppo.OppoFactory;

public class TestMain {
    public static void main(String[] args) {
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        OppoFactory oppoFactory = new OppoFactory();
        AppleFactory appleFactory = new AppleFactory();

        SmartPhone oppoPhone = oppoFactory.producePhone();
        Pad oppoPad = oppoFactory.producePad();
        System.out.println(oppoPhone.getSystemInfo());
        System.out.println(oppoPad.getPadInfo());

        SmartPhone huaweiPhone = huaweiFactory.producePhone();
        Pad huaweiPad = huaweiFactory.producePad();
        System.out.println(huaweiPhone.getSystemInfo());
        System.out.println(huaweiPad.getPadInfo());

        SmartPhone iphone = appleFactory.producePhone();
        Pad ipad = appleFactory.producePad();
        System.out.println(iphone.getSystemInfo());
        System.out.println(ipad.getPadInfo());
    }
}
