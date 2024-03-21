package ua.com.kneu.group201.lab3.proxy;

public class Main {

    public static void main(String[] args) {

        MyImage myImage = new MyImage("/image.jpg");
        myImage.display();

        Proxy proxy = new Proxy("/image.jpg");
        proxy.display();


    }

}
