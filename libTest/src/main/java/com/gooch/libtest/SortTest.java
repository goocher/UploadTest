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


public class SortTest {
    public void MaoPaoSort(int[] ints) {
        int temp;
        for (int i=0;i<ints.length;i++) {
            for (int j=0;j<ints.length-i-1;j++) {
                if (ints[j] > ints[j + 1]) {
                    temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }

    public void selectSort(int[] a) {
        for (int i=0;i<a.length;i++) {
            int k = i;
            for (int j=i+1;j<a.length;j++) {
                if (a[j] < a[k]) {
                    k = j ;
                }
            }
            if (k != i) {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
    }

    public void insertSort(int[] a) {
        for (int i=1;i<a.length;i++) {
            for (int j=i-1;j>=0;j--) {
                if (a[j] > a[j + 1]) {

                }
            }
        }
    }
}
