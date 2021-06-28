package com.star.design.listen;

import java.util.Observable;


public class MySubject extends Observable {

    private int data;

    private int arg;

    public int getData() {
        return data;
    }

    public int getArg() {
        return arg;
    }

    public void setData(int xx) {
        data = xx + 2;
        arg = xx;//记录参数
        setChanged();
        notifyObservers();
    }
}
