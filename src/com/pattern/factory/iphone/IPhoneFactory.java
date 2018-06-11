package com.pattern.factory.iphone;

import com.pattern.factory.AbstractPhoneFactory;
import com.pattern.factory.SmartPhone;

public class IPhoneFactory extends AbstractPhoneFactory {
    @Override
    public SmartPhone producePhone() {
        return new IPhoneX();
    }
}
