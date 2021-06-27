package behaviouralPatterns.observerPattern;

import behaviouralPatterns.observerPattern.editor.Editor;
import behaviouralPatterns.observerPattern.listeners.EmailNotificationListener;
import behaviouralPatterns.observerPattern.listeners.LogOpenListener;

public class observerPatternStart {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
