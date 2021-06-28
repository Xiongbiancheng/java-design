package com.star.design.factory.factory;

import com.star.design.factory.abs.AbstractFactory;
import com.star.design.factory.abs.Color;
import com.star.design.factory.abs.Plane;
import com.star.design.factory.dto.plane.Aircraft;
import com.star.design.factory.dto.plane.Fighter;
import com.star.design.factory.dto.plane.Helicopter;

public class PlaneFactory extends AbstractFactory {
    private static final int AIRCRAFT_TYPE = 1; //客机
    private static final int HELICOTER_TYPE = 2;//直升机
    private static final int FIGHTER_TYPE = 3;//战斗机

    //根据飞机类型去取飞机
    @Override
    public Plane getPlane(int planeType){
        if (planeType == AIRCRAFT_TYPE){
            return new Aircraft();
        } else if (planeType == HELICOTER_TYPE){
            return new Helicopter();
        } else if (planeType == FIGHTER_TYPE){
            return new Fighter();
        }else {
            return null;
        }
    }

    @Override
    public Color getColor(int type) {
        return null;
    }

}
