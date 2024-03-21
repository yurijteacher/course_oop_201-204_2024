package ua.com.kneu.lecture3.creational.factory;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        Drive drive = factory.getDriver("postgres");

        System.out.println(drive.getConnection("jdbc:postgres://localhost:5432/test", "root",
                "1234"));

        drive.execute("SELECT * FROM `category`");

        System.out.println(drive);

        Drive drive1 = factory.getDriver("postgres");
        System.out.println(drive1);



    }
}
