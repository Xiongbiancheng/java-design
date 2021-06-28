package com.star.design.factory.dto.plane;

import com.star.design.factory.abs.Plane;

public class Fighter implements Plane {
    @Override
    public void fly() {
        System.out.println("Fighter fly: 战斗机飞行");
    }
}
