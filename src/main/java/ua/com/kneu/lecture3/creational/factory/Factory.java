package ua.com.kneu.lecture3.creational.factory;

public class Factory {

    public Drive getDriver(String db){

        Drive drive = null;

        switch (db){
            case ("mysql"): drive = new JdbcDriverMysql();
                            break;
            case ("postgres"): drive = new JdbcDriverPostgres();
                break;
            case ("db2"): drive = new JdbcDriverDb2();
                break;
        }

        return drive;
    }


}
