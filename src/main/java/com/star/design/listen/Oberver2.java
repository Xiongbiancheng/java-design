package com.star.design.listen;

import java.util.Observable;
import java.util.Observer;

public class Oberver2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o);
        System.out.println(arg);
        System.out.println("22222");
    }
}
