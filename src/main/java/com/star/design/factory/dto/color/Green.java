package com.star.design.factory.dto.color;

import com.star.design.factory.abs.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green fill : 绿色");
    }
}
