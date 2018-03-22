package com.gooch.libtest;

/**
 * <pre>
 * author : gooch
 * e-mail : zhaoguangchao@100tal.com
 * time   : 2018/3/6
 * desc   :
 * version: 1.0
 * </pre>
 */


public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.setExit(true);

    }
}

class MyThread extends Thread{
    boolean exit = false;

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    @Override
    public void run() {
        super.run();
        while (!exit) {
            try {
                System.out.println("running");
                Thread.sleep(1000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}