package com.wz.thread;

/**
 * @author: wz
 * @date: 2022/10/23
 * Buddha Bless, No Bug !
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 myThread1 = new MyThread1(lock);
            myThread1.start();

            Thread.sleep(3000);

            MyThread2 myThread2 = new MyThread2(lock);
            myThread2.start();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始    wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束    wait time=" + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始    notify time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("结束    notify time=" + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

