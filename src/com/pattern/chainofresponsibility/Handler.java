package com.pattern.chainofresponsibility;

public abstract class Handler {

    private int permissionLevel = 0;
    private Handler next;

    public Handler(int permission) {
        this.permissionLevel = permission;
    }

    public void handleMessage(IMessenger messenger) {
        if (this.permissionLevel == messenger.getPermissionLevel()) {
            response(messenger);
            return;
        }

        if (this.next == null) {
            return;
        }

        this.next.handleMessage(messenger);
    }

    public void setNextHandler(Handler handler) {
        this.next = handler;
    }

    public abstract void response(IMessenger messenger);

}
