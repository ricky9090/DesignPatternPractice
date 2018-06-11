package com.pattern.factory.huawei;

import com.pattern.factory.AbstractPhoneFactory;
import com.pattern.factory.SmartPhone;

public class HuaweiPhoneFactory extends AbstractPhoneFactory {
    @Override
    public SmartPhone producePhone() {
        return new HuaweiMate();
    }
}
