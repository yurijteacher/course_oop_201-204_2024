package ua.com.kneu.group201.lib2.homework;

import java.math.BigDecimal;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Category category = new Category(1L, "air", "asd asd asd", "/images/air.jg");

        Product macbookAir2020 = new Product(category, 1L, "air2020", "asd asd asd",  new BigDecimal(25000));
        Product macbookAir2022 = new Product(category, 2L, "air2022", "asd asd asdd",  new BigDecimal(40000));

        Client client = new Client(1L, "Vasya", "Pypkin", 25, 1232423, "vasya@ukr.et","vasya","1234");

        Order order = new Order(1L, new Date(), false, client, "cash","nova p");

        ProductHasOrder productHasOrder1 = new ProductHasOrder(1L, macbookAir2020, order, 1);
        ProductHasOrder productHasOrder2 = new ProductHasOrder(2L, macbookAir2022, order, 2);

        System.out.println(category);
        System.out.println(macbookAir2020);
        System.out.println(macbookAir2022);
        System.out.println(client);
        System.out.println(order);
        System.out.println(productHasOrder1);
        System.out.println(productHasOrder2);

    }
}
