package me.liheng.observer;

import java.io.File;

//Sends emails upon receiving notification
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Email to " + email + ": Someone has performed " +
                eventType + " operation with the following file: " + file.getName());
    }
}
