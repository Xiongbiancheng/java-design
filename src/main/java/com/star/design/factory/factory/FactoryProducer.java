package com.star.design.factory.factory;

import com.star.design.factory.abs.AbstractFactory;

public class FactoryProducer {
    private static final int PLANE_FACTORY_TYPE = 1;

    private static final int COLOR_FACTORY_TYPE = 2;

    public static AbstractFactory getFactory(int type){
       if (type == PLANE_FACTORY_TYPE){
           return new PlaneFactory();
       } else if (type == COLOR_FACTORY_TYPE){
           return new ColorFactory();
       }else {
           return null;
       }
    }
}
