package me.liheng.observer;

public class ObserverPattern {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("README.md"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

