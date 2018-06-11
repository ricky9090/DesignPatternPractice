package com.pattern.factory.oppo;

import com.pattern.factory.AbstractPhoneFactory;
import com.pattern.factory.SmartPhone;

public class OppoFactory extends AbstractPhoneFactory {
    @Override
    public SmartPhone producePhone() {
        return new OppoR15();
    }
}
