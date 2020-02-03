package com.company;

import com.company.bridgeTest.draw.Green;
import com.company.bridgeTest.draw.Red;
import com.company.bridgeTest.shapes.Circle;
import com.company.bridgeTest.shapes.Shape;
import com.company.devices.Device;
import com.company.devices.Radio;
import com.company.devices.TV;
import com.company.remotes.SimpleRemote;
import com.company.remotes.SuperRemote;

public class Main {

    public static void main(String[] args) {
        //todo tutorial with one abstract class

        Shape redcircle = new Circle(new Red(), 100, 100, 100);
        Shape greencircle = new Circle(new Green(), 100, 100, 100);

        redcircle.draw();
        greencircle.draw();


        //todo refactoringg type with 2 interfaces

//    testDevice(new TV());
//    testDevice(new Radio());

    }

//    public static void testDevice(Device device){
//        SimpleRemote simpleRemote = new SimpleRemote(device);
//        simpleRemote.doRemote();
//        device.doWork();
//
//        SuperRemote superRemote = new SuperRemote(device);
//        superRemote.doRemote();
//        device.doWork();
//}

}

