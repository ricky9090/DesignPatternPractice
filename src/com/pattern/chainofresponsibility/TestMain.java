package com.pattern.chainofresponsibility;

import com.pattern.chainofresponsibility.module.AdminModule;
import com.pattern.chainofresponsibility.module.ManagerModule;
import com.pattern.chainofresponsibility.module.UserModule;
import com.pattern.chainofresponsibility.user.AdminUser;
import com.pattern.chainofresponsibility.user.ManagerUser;
import com.pattern.chainofresponsibility.user.NormalUser;

public class TestMain {

    public static void main(String[] args) {
        NormalUser user = new NormalUser();
        ManagerUser manager = new ManagerUser();
        AdminUser admin = new AdminUser();

        UserModule userModule = new UserModule();
        ManagerModule managerModule = new ManagerModule();
        AdminModule adminModule = new AdminModule();
        userModule.setNextHandler(managerModule);
        managerModule.setNextHandler(adminModule);

        userModule.handleMessage(user);
        userModule.handleMessage(manager);
        userModule.handleMessage(admin);

    }
}
