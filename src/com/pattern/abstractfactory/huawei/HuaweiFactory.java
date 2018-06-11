package com.pattern.abstractfactory.huawei;

import com.pattern.abstractfactory.AbstractDigitalFactory;
import com.pattern.abstractfactory.Pad;
import com.pattern.abstractfactory.SmartPhone;

public class HuaweiFactory extends AbstractDigitalFactory {
    @Override
    public SmartPhone producePhone() {
        return new HuaweiMate();
    }

    @Override
    public Pad producePad() {
        return new HuaweiPad99();
    }
}
