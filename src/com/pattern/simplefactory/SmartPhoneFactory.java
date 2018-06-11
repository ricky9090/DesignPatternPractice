package com.pattern.simplefactory;

public class SmartPhoneFactory {
    public static SmartPhone createSmartPhone(Class clazz) {
        SmartPhone phone = null;
        try {
            phone = (SmartPhone) clazz.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return phone;
    }
}
