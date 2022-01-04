package me.liheng.observer;

import java.io.File;

//Concrete publisher, tracked by other objects
public class Editor {
    private File file;

    public EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventManager.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
