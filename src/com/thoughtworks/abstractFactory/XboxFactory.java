package com.thoughtworks.abstractFactory;

import model.infrastructure.*;
import model.xbox.MicrosoftBox;
import model.xbox.XBox;

public class XboxFactory implements Factory {
    @Override
    public GamingBox produce(String name) {
        Handle handle = new Handle(name);
        Kinect kinect = new Kinect(name);
        Wrapper wrapper = new Wrapper(name);
        PowerLine powerLine = new PowerLine(name);

        MicrosoftBox box = new MicrosoftBox(name);

        return new XBox(box, handle, kinect, wrapper, powerLine);
    }
}
