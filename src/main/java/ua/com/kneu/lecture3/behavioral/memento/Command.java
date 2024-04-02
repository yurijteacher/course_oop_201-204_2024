package ua.com.kneu.lecture3.behavioral.memento;

public class Command {

    private Snapshot backup;

    public void makeBackup(Editor editor){
        backup = editor.createSnapshop();
    }

    public Editor undo(){
        return (backup!=null) ? backup.restore() : null;
    }
}
