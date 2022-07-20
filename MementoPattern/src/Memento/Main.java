package Memento;

public class Main {

    /*
     * Video Reference: https://youtu.be/_Q5rXfGuyLQ
     */
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("My Name");
        editor.printText();
        editor.write("My Name is");
        editor.printText();
        editor.write("My name is Sireesan");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }

}