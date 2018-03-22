package com.gooch.libtest;

/**
 * <pre>
 * author : gooch
 * e-mail : zhaoguangchao@100tal.com
 * time   : 2018/3/13
 * desc   :
 * version: 1.0
 * </pre>
 */


public interface MyMap<K,V> {
    V put(K k, V v);

    V get(K k);

    int size();

}
