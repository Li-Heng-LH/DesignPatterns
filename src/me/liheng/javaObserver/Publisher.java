package me.liheng.javaObserver;

import java.util.Observable;

public class Publisher extends Observable {

    public void publish(String msg) {
        setChanged();
        notifyObservers(msg);
    }

}
