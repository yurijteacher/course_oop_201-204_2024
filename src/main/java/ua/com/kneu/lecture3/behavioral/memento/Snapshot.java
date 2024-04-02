package ua.com.kneu.lecture3.behavioral.memento;

public class Snapshot {

    private Editor editor;
    private String text;
    private String curX;
    private String curY;
    private String width;

    public Snapshot(Editor editor, String text, String curX, String curY, String width) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.width = width;
    }

    public Editor restore(){
        editor.setCurX(curX);
        editor.setCurY(curY);
        editor.setText(text);
        editor.setWidth(width);

        return editor;
    }

}
