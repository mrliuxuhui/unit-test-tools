package com.flyingwillow.utt.extensionpoint;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExtensionHolder<T> {

    private final CopyOnWriteArrayList<T> list ;

    public ExtensionHolder(List<T> list) {
        this.list = new CopyOnWriteArrayList<>(list);
    }

    public void remove(T e) {
        this.list.remove(e);
    }

    public void add(T e) {
        this.list.add(e);
    }
}
