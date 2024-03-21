package ua.com.kneu.group204.lab2.realization.db;

public class Main {
    public static void main(String[] args) {

        String db = "postgres";

        DriverJdbc driver = null;

        switch (db){
            case ("mysql") :  driver = new MySQLDriver();
                              break;
            case ("postgres") :  driver = new PostgresDriver();
                              break;
        }


        driver.getConnection("jdbc:postgres://localhost:5432/test", "root", "12345");

        driver.execute("SELECT * from `category`");

    }

}
