package com.pattern.chainofresponsibility.user;

import com.pattern.chainofresponsibility.IMessenger;
import com.pattern.chainofresponsibility.PermissionLevel;

public class ManagerUser implements IMessenger {
    @Override
    public int getPermissionLevel() {
        return PermissionLevel.MANAGER;
    }

    @Override
    public String getRequest() {
        return "Add Document";
    }
}
