package ua.com.kneu.group203.lab2.my_interface.db;

public class Main {

    public static void main(String[] args) {

        String db = "mysql";

        DriverDB driver = null;

        switch (db) {
            case ("mysql"):
                driver = new DriverMySQL();
                break;
            case ("postgres"):
                driver = new DriverPostgres();
                break;
        }


        System.out.println(driver.getConnection("jdbc:mysql://localhost:3306/test", "root", "root"));


    }

}
