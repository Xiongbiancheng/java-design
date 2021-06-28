package com.star.design.factory.dto.plane;

import com.star.design.factory.abs.Plane;

public class Helicopter implements Plane {
    @Override
    public void fly() {
        System.out.println("Helicopter fly: 直升机飞行");
    }
}
