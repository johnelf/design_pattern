package com.thoughtworks.abstractFactory;

import model.infrastructure.GamingBox;

public class LivingRoom {

    public static void main(String args[]) {
        Factory sony = new SonyFactory();

        GamingBox ps4 = sony.produce("PS4");

        ps4.start();

        Factory ms = new XboxFactory();

        GamingBox xbox = ms.produce("360");

        xbox.start();
    }
}
