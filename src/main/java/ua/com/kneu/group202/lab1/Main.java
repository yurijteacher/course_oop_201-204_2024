package ua.com.kneu.group202.lab1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // v.1
        Category air = new Category(1L, "air", "asdd", "/images/air.jpg");
        Category pro = new Category(2L, "pro", "asdd", "/images/pro.jpg");

        // v.2
        Product product = new Product();
        product.setId(1L);
        product.setName("apple macbook air");
        product.setPrice(new BigDecimal(45000));
        product.setDescription("2020");
        product.setLinkImage("/images/air.jpg");
        product.setCategory(air);


        System.out.println(air);

        System.out.println(product);

        Product product1 = new Product();
        product1.setId(2L);
        product1.setName("apple macbook pro");
        product1.setPrice(new BigDecimal(55000));
        product1.setDescription("2022");
        product1.setLinkImage("/images/pro2020.jpg");
        product1.setCategory(pro);

        Client client = new Client(1L, "Vasya", "Pypkin",23, "51323", "v@ukr.net");

        Address address = new Address();
        address.setId(1L);
        address.setCity("Kiev");

        List<Address> addressList = new ArrayList<>();
        addressList.add(address);

        client.setAddressList(addressList);


        System.out.println(client);


    }
}
