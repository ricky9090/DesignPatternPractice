package com.pattern.abstractfactory.iphone;

import com.pattern.abstractfactory.AbstractDigitalFactory;
import com.pattern.abstractfactory.Pad;
import com.pattern.abstractfactory.SmartPhone;

public class AppleFactory extends AbstractDigitalFactory {
    @Override
    public SmartPhone producePhone() {
        return new IPhoneX();
    }

    @Override
    public Pad producePad() {
        return new IPadAir();
    }
}
