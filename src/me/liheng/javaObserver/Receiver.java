package me.liheng.javaObserver;

import java.util.Observable;
import java.util.Observer;

public class Receiver implements Observer {

    @Override
    public void update(Observable o, Object msg) {
        System.out.println(msg);
    }
}
