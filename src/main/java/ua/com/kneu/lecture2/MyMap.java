package ua.com.kneu.lecture2;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ivan");
        map.put(2, "Vasya");
        map.put(3, "Ivanka");

        System.out.println(map.get(1));
        System.out.println(map.get(3));

        System.out.println(map);

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        Map<String, String> map1 = new HashMap<>();
        map1.put("Ivan","Ivan");


    }


}
