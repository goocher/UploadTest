package com.gooch.libtest;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * <pre>
 * author : gooch
 * e-mail : zhaoguangchao@100tal.com
 * time   : 2018/2/26
 * desc   :
 * version: 1.0
 * </pre>
 */


public class QueueTest<T> implements Iterable<T> {
    public QueueTest() {
    }

    public void enqueue(T t) {

    }

    public T dequeue() {
        return (T) new Object();
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> consumer) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
