package com.star.design.factory.factory;

import com.star.design.factory.abs.AbstractFactory;
import com.star.design.factory.abs.Color;
import com.star.design.factory.abs.Plane;
import com.star.design.factory.dto.color.Green;
import com.star.design.factory.dto.color.Red;
import com.star.design.factory.dto.color.Yellow;

public class ColorFactory extends AbstractFactory {
    private static final int RED_TYPE = 1; //红
    private static final int GREEN_TYPE = 2;//绿
    private static final int YELLOW_TYPE = 3;//黄

    @Override
    public Plane getPlane(int type) {
        return null;
    }

    //根据颜色类型去取颜色
    @Override
    public Color getColor(int colorType){

        if (colorType == RED_TYPE){
            return new Red();
        } else if (colorType == GREEN_TYPE){
            return new Green();
        } else if (colorType == YELLOW_TYPE){
            return new Yellow();
        }else {
            return null;
        }
    }
}
