package com.thoughtworks.abstractFactory;

import model.infrastructure.*;
import model.ps.PS4;
import model.ps.SonyBox;

public class SonyFactory implements Factory {
    @Override
    public GamingBox produce(String name) {
        Handle handle = new Handle(name);
        Kinect kinect = new Kinect(name);
        Wrapper wrapper = new Wrapper(name);
        PowerLine powerLine = new PowerLine(name);

        SonyBox box = new SonyBox(name);

        return new PS4(box, handle, kinect, wrapper, powerLine);
    }
}
