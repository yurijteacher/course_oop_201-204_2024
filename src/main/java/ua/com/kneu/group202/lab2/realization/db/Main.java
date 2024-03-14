package ua.com.kneu.group202.lab2.realization.db;

public class Main {
    public static void main(String[] args) {

        Driver driver = null;

        String db = "mysql";

        switch (db){
            case ("mysql"): driver = new DriverMySQL();
                            break;
            case ("postgres"): driver = new DriverPostgres();
                            break;
        }

        System.out.println(driver.getConnection("jdbc:mysql://localhost:3306/test", "root", "root"));

        String text = "jdbc:mysql://localhost:3306/test";

        String[] arr = text.split(":");
        System.out.println(arr[1]);




        driver.execute("select * from `category`");

    }
}
