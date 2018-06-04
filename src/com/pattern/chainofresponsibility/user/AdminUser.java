package com.pattern.chainofresponsibility.user;

import com.pattern.chainofresponsibility.IMessenger;
import com.pattern.chainofresponsibility.PermissionLevel;

public class AdminUser implements IMessenger {

    @Override
    public int getPermissionLevel() {
        return PermissionLevel.ADMINISTRATOR;
    }

    @Override
    public String getRequest() {
        return "Add Project";
    }
}
