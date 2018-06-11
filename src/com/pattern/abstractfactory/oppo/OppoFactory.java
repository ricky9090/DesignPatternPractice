package com.pattern.abstractfactory.oppo;

import com.pattern.abstractfactory.AbstractDigitalFactory;
import com.pattern.abstractfactory.Pad;
import com.pattern.abstractfactory.SmartPhone;

public class OppoFactory extends AbstractDigitalFactory {
    @Override
    public SmartPhone producePhone() {
        return new OppoR15();
    }

    @Override
    public Pad producePad() {
        return new OppoPad99();
    }
}
