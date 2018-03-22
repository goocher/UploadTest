package com.gooch.libtest;

/**
 * <pre>
 * author : gooch
 * e-mail : zhaoguangchao@100tal.com
 * time   : 2018/3/12
 * desc   :
 * version: 1.0
 * </pre>
 */


public class FatherTest {
    static {
        System.out.println("father static print");
    }
    {
        System.out.println("father create");
    }

    public static void staticFunction() {
        System.out.println("father static method print");
    }

    public void function() {
        System.out.println("father function print");
    }
}
