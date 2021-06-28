package com.star.design.listen;

import java.util.Observable;
import java.util.Observer;

public class Oberver1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o);
        MySubject x = (MySubject)o;
        System.out.println(x.getData());
        System.out.println(x.getArg());

        System.out.println(arg);
        System.out.println("11111");
    }
}
