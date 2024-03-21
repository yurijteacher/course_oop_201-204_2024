package ua.com.kneu.group201.lab3.proxy;

public class MyImage implements Image{

    String file;
    public MyImage(String file) {
        this.file = file;
        load();
    }

    public void load(){
        System.out.println("load " + file);
    }


    @Override
    public void display() {
        System.out.println("open " + file);
    }
}
