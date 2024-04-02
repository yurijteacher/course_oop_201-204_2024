package ua.com.kneu.lecture3.behavioral.memento;

public class Editor {
    private String text;
    private String curX;
    private String curY;
    private String width;

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", curX='" + curX + '\'' +
                ", curY='" + curY + '\'' +
                ", width='" + width + '\'' +
                '}';
    }

    public Editor() {
    }

    public Editor(String text, String curX, String curY, String width) {
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.width = width;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCurX() {
        return curX;
    }

    public void setCurX(String curX) {
        this.curX = curX;
    }

    public String getCurY() {
        return curY;
    }

    public void setCurY(String curY) {
        this.curY = curY;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Snapshot createSnapshop() {
        return new Snapshot(this,text, curX, curY, width);
    }

}
