package com.thoughtworks.simpleFactory;

import model.infrastructure.GamingBox;

public class LivingRoom {

    public static void main(String args[]) {
        GamingBox box1 = SimpleXboxFactory.produce("360");
        box1.start();

        GamingBox box2 = SimpleXboxFactory.produce("One");
        box2.start();

        GamingBox box3 = SimpleXboxFactory.produce("PS");
        box3.start();
    }
}
