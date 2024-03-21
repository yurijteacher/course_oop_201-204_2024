package ua.com.kneu.group202.lab3.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {

    public static Map<String, Drive> maps = new HashMap<>();

    public Drive getDriver(String db){

        Drive drive = maps.get(db);

        if(drive==null) {

            switch (db) {
                case ("mysql"):
                    drive = new JdbcDriverMysql();
                    break;
                case ("postgres"):
                    drive = new JdbcDriverPostgres();
                    break;
                case ("db2"):
                    drive = new JdbcDriverDb2();
                    break;
            }
            maps.put(db, drive);
        }
        return drive;
    }
}
