package ua.com.kneu.lecture3.behavioral.memento;

public class Main
{

    public static void main(String[] args) {

        Editor editor = new Editor("1L", "0", "5","200");

        Command command = new Command();
        command.makeBackup(editor);

        System.out.println(editor);

        editor.setCurY("10");
        System.out.println(editor);

        command.undo();
        System.out.println(editor);



    }
}
