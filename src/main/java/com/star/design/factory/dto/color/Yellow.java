package com.star.design.factory.dto.color;

import com.star.design.factory.abs.Color;

public class Yellow implements Color {
    @Override
    public void fill() {
        System.out.println("Green fill : 黄色");
    }
}
