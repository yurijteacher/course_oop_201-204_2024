package ua.com.kneu.group204.lab3.homework.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryShare {

    private static final Map<String, Share> shares = new HashMap<>();

    public Share getShape(String nameShape) {

        Share shape = shares.get(nameShape);
        if (shape == null) {

            switch (nameShape) {
                case "точка":
                    shape = new Point();
                    break;
                case "коло":
                    shape = new Circle();
                    break;
                case "квадрат":
                    shape = new Square();
                    break;
            }
            shares.put(nameShape, shape);
        }
        return shape;
    }

}
