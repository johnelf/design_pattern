package com.thoughtworks.simpleFactory;

import model.infrastructure.*;
import model.ps.PS4;
import model.ps.SonyBox;
import model.xbox.MicrosoftBox;
import model.xbox.XBox;

public class SimpleXboxFactory {

    public static GamingBox produce(String name) {
        Handle handle = new Handle(name);
        Kinect kinect = new Kinect(name);
        Wrapper wrapper = new Wrapper(name);
        PowerLine powerLine = new PowerLine(name);

        if (name.equals("One") || name.equals("360")) {
            MicrosoftBox box = new MicrosoftBox(name);
            return new XBox(box, handle, kinect, wrapper, powerLine);
        } else {
            SonyBox sonyBox = new SonyBox(name);
            return new PS4(sonyBox, handle, kinect, wrapper, powerLine);
        }

    }
}
