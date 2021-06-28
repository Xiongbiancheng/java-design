package com.star.design.factory.abs;

public abstract class AbstractFactory {

    public abstract Plane getPlane(int type);

    public abstract Color getColor(int type);
}
