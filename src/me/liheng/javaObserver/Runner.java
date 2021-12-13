package me.liheng.javaObserver;

import java.util.Observer;

public class Runner {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Observer receiver = new Receiver();

        publisher.addObserver(receiver);
        publisher.publish("1st msg");
        publisher.publish("2nd msg");
        publisher.publish("3rd msg");
    }
}
