package me.liheng.javaObserver;

import java.util.Observable;

public class Publisher extends Observable {

    public void publish(String msg) {
        new Thread(() -> {
            setChanged();
            notifyObservers(msg);
        }).start();
    }

}
