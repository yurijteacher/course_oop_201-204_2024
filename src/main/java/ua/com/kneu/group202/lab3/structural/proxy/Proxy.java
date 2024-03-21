package ua.com.kneu.group202.lab3.structural.proxy;

public class Proxy implements Image {

    String file;

    MyImage myImage;

    public Proxy(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if(myImage==null) myImage = new MyImage(file);
        save();
    }

    public void save(){
        System.out.println("save: " + file );
    }
}
