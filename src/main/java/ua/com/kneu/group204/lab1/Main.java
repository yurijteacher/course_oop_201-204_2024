package ua.com.kneu.group204.lab1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main
{

    public static void main(String[] args) {

        Category category1 = new Category(1L, "mac pro", "asdsa sad","/category/pro.jpg");

        Category category2 = new Category();
        category2.setId(2L);
        category2.setName("mac air");
        category2.setDescription("asdsad as d sa");
        category2.setImage("/category/air.jpg");


        Product air2020 = new Product(1L, "air 2020", "asd asd", new BigDecimal(20000.0), category1);
        Product air2022 = new Product(2L, "air 2022", "asd asd", new BigDecimal(24000.0), category1);

        List<Product> productList = new ArrayList<>();
        productList.add(air2020);
        productList.add(air2022);

        category1.setProductList(productList);


        System.out.println(air2020);
        System.out.println(category1);

        Client client1 = new Client();
        client1.setId(1L);
        client1.setFirstName("Vasya");
        client1.setLastName("Pypkin");
        client1.setAge((short) 16);
        client1.setPhone(1112233);
        client1.setEmail("vasya@ukr.net");

        Users user1 = new Users();
        user1.setId(1L);
        user1.setLogin("vasya");
        user1.setPass("1234");

        client1.setUser(user1);

        System.out.println(client1);

        Order order = new Order();

        order.setId(1L);
        order.setClient(client1);
        order.setDelivery("asd");
        order.setPayment("asd");
        order.setDateCreated(new Date());

        System.out.println(order);


        ProductHasOrder productHasOrder = new ProductHasOrder();

        productHasOrder.setId(1L);
        productHasOrder.setOrder(order);
        productHasOrder.setProduct(air2020);
        productHasOrder.setQuantity((short) 1);

        System.out.println(productHasOrder);

    }


}
