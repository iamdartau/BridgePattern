package com.company.remotes;

import com.company.devices.Device;

public class SimpleRemote implements Remote {

    Device device;

    public SimpleRemote() {}

    public SimpleRemote(Device device) {
        this.device = device;
    }

    @Override
    public void doRemote() {

        System.out.println("I'm corny remote controller");
    }
}
