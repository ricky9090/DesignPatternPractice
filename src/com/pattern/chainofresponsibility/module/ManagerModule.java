package com.pattern.chainofresponsibility.module;

import com.pattern.chainofresponsibility.Handler;
import com.pattern.chainofresponsibility.IMessenger;
import com.pattern.chainofresponsibility.PermissionLevel;

public class ManagerModule extends Handler {

    public ManagerModule() {
        super(PermissionLevel.MANAGER);
    }

    @Override
    public void response(IMessenger messenger) {
        System.out.println("ManagerModule response request: " + messenger.getRequest());
    }
}
