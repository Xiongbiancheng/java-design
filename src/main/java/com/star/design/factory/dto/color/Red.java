package com.star.design.factory.dto.color;

import com.star.design.factory.abs.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red fill : 红色");
    }
}
