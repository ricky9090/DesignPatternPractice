package com.pattern.chainofresponsibility.module;

import com.pattern.chainofresponsibility.Handler;
import com.pattern.chainofresponsibility.IMessenger;
import com.pattern.chainofresponsibility.PermissionLevel;

public class AdminModule extends Handler {

    public AdminModule() {
        super(PermissionLevel.ADMINISTRATOR);
    }

    @Override
    public void response(IMessenger messenger) {
        System.out.println("AdministratorModule response request: " + messenger.getRequest());
    }
}
