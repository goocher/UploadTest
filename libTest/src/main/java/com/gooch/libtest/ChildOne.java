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


public class ChildOne extends FatherTest {
    static {
        System.out.println("childone static print");
    }
    {
        System.out.println("childone create");
    }
    public static void childonestaticFunction() {
        System.out.println("child one static method print");
    }
//    public static void staticFunction() {
//        System.out.println("childone static method print");
//    }
    public void childonefunction() {
        System.out.println("childone function print");
    }
    public boolean childonefunction(int a) {
        System.out.println("childone function print");
        return false;
    }
}
