package me.liheng.javaObserver;

import java.util.Observer;

public class Runner {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Observer receiver = new Receiver();
        Observer receiver2 = new Receiver();

        publisher.addObserver(receiver);
        publisher.addObserver(receiver2);
        publisher.publish("1st msg");
        publisher.publish("2nd msg");
        publisher.publish("3rd msg");
    }
}
