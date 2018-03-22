package com.gooch.libtest;

/**
 * <pre>
 * author : gooch
 * e-mail : zhaoguangchao@100tal.com
 * time   : 2018/2/28
 * desc   :
 * version: 1.0
 * </pre>
 */


public class PubResource {
    public int num = 0;
    public int size = 10;

    public void increase() {
        while (num > size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        num++;
        System.out.println("当前资源："+num+"个");
        notifyAll();
    }

    public void decrease() {
        while (num <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("当前资源："+num+"个");
        notifyAll();
    }
}
