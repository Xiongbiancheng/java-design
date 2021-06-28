package com.star.design.factory.dto.plane;

import com.star.design.factory.abs.Plane;

public class Aircraft implements Plane {
    @Override
    public void fly() {
        System.out.println("Aircraft fly: 客机飞行");
    }
}
