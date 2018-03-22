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


public class TestIn {
    public static void main(String[] args) {
        FatherTest childOne = new ChildOne();
        FatherTest childTwo = new ChildTwo();
        childOne.function();
        childTwo.function();
        ChildOne.staticFunction();
        new Thread(new Thread()).start();
    }
}
