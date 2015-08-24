package com.thoughtworks.easy;

import model.infrastructure.Handle;
import model.infrastructure.Kinect;
import model.infrastructure.PowerLine;
import model.infrastructure.Wrapper;
import model.xbox.MicrosoftBox;
import model.xbox.XBox;

public class LivingRoom {

    public static void main(String args[]) {
        MicrosoftBox box1 = new MicrosoftBox("360");
        Handle handle1 = new Handle("360");
        Kinect kinect1 = new Kinect("360");
        Wrapper wrapper1 = new Wrapper("360");
        PowerLine powerLine1 = new PowerLine("360");

        XBox xbox360 = new XBox(box1, handle1, kinect1, wrapper1, powerLine1);

        xbox360.start();

        MicrosoftBox box2 = new MicrosoftBox("One");
        Handle handle2 = new Handle("One");
        Kinect kinect2 = new Kinect("One");
        Wrapper wrapper2 = new Wrapper("One");
        PowerLine powerLine2 = new PowerLine("One");

        XBox xboxOne = new XBox(box2, handle2, kinect2, wrapper2, powerLine2);

        xboxOne.start();

    }
}
