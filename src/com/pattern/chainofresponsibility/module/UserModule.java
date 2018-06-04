package com.pattern.chainofresponsibility.module;

import com.pattern.chainofresponsibility.Handler;
import com.pattern.chainofresponsibility.IMessenger;
import com.pattern.chainofresponsibility.PermissionLevel;

public class UserModule extends Handler {

    public UserModule() {
        super(PermissionLevel.USER);
    }

    @Override
    public void response(IMessenger messenger) {
        System.out.println("UserModule response request: " + messenger.getRequest());
    }
}
