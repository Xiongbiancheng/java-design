package com.star.design.factory.dto.color;


public class Pig{
    private  static ThreadLocal<Cat> tl = new ThreadLocal<Cat>();

    public static void main(String[] args) {
        new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(tl.get());
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tl.set(new Cat());
        }).start();
    }
    public static class Cat{
        private String name="XXY";
    }

}
