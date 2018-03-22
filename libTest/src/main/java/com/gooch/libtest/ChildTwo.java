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


public class ChildTwo extends FatherTest {
    static {
        System.out.println("childtwo static print");
    }
    {
        System.out.println("childtwo create");
    }
    public static void childtwostaticFunction() {
        System.out.println("childtwo static method print");
    }

    public void childtwofunction() {
        System.out.println("childtwo function print");
    }
}
