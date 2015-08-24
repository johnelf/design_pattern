package com.thoughtworks.abstractFactory;

import model.infrastructure.GamingBox;

public interface Factory {
    GamingBox produce(String name);
}
