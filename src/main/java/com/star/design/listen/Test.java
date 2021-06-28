package com.star.design.listen;


public class Test {
    public static void main(String[] args) {
        Oberver1 oberver1 = new Oberver1();
        Oberver2 oberver2 =  new Oberver2();;

        MySubject subject = new MySubject();
        subject.addObserver(oberver1);
        subject.addObserver(oberver2);
        subject.setData(11);
    }
}
