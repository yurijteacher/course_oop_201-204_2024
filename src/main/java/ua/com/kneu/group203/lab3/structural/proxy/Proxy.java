package ua.com.kneu.group203.lab3.structural.proxy;

public class Proxy implements Image{

    String file;
    MyImage myImage;

    public Proxy(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if(myImage == null) {
            myImage = new MyImage("\\file.jpg");
        }
        copy();
    }

    public void copy(){
        System.out.println("copy: "+ file);
    }
}
