package com.star.design.factory.util;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadId {
    // 包含要分配的下一个线程ID的原子整数
    private static final AtomicInteger nextId = new AtomicInteger(0);

    // 包含每个线程ID的线程局部变量
    private static final ThreadLocal<Integer> threadId =
            new ThreadLocal<Integer>() {
                @Override protected Integer initialValue() {
                    return nextId.getAndIncrement();
                }
            };

    // 返回当前线程的唯一ID，并在必要时分配它
    public static int get() {
        return threadId.get();
    }

    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            new Thread(()->{
                System.out.println(get());
            });
        }
    }
}
