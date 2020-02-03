package com.company.remotes;

import com.company.devices.Device;

public class SuperRemote extends SimpleRemote {

    public SuperRemote(Device device) {
        super.device = device;
    }

    @Override
    public void doRemote() {
        device.doWork();
        System.out.println("I'm not so stypid as simpleRemote and I work good");
    }
}
