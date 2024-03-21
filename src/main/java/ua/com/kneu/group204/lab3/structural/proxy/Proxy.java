package ua.com.kneu.group204.lab3.structural.proxy;

public class Proxy implements Image{

    String file;

    public Proxy(String file) {
        this.file = file;
    }

    MyImage myImage;

    public void copy(){
        System.out.println("copy " + file);
    }
    @Override
    public void display() {
        if(myImage==null) myImage = new MyImage(file);
        copy();
    }
}
