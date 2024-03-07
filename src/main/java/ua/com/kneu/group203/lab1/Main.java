package ua.com.kneu.group203.lab1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Category air = new Category();
        air.setId(1L);
        air.setName("air");
        air.setDescription("asd sad asd");
        air.setImage("/images/air.jpg");

        Category pro = new Category(2L,"pro","asd asd sad","/images");

        System.out.println(air);

        Product air2020 = new Product();

            air2020.setId(1L);
            air2020.setName("macbook air 2020");
            air2020.setCategory(air);
            air2020.setDescription("asd asd asd");
            air2020.setImage("/images/image.jpg");
            air2020.setPrice(new BigDecimal(45000));

        System.out.println(air2020);

        Product pro1 = new Product(1L, "pro","asd asd","/images/pro.jpg", new BigDecimal(33333),pro);

        System.out.println(pro1);


        Client client = new Client();
        client.setId(1L);
        client.setFirstName("Vasya");
        client.setLastName("Pypkin");
        client.setEmail("asd@ukr.net");
        client.setPhone("51323");

        Address address = new Address();
        address.setId(1L);
        address.setCountry("Ukraine");

        List<Address> addressList = new ArrayList<>();
        addressList.add(address);

        client.setAddressList(addressList);
        Users user = new Users();

        user.setId(1L);
        user.setUsername("vasya");
        user.setPassword("passw");

        client.setUser(user);

        System.out.println(client);

        Roles role1 = new Roles();
        role1.setId(1L);
        role1.setName("user");

        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("manager");

        Roles role3 = new Roles();
        role3.setId(3L);
        role3.setName("admin");

        RolesHasUsers rolesHasUsers1 = new RolesHasUsers();

        rolesHasUsers1.setId(1L);
        rolesHasUsers1.setUser(user);
        rolesHasUsers1.setRole(role1);

        RolesHasUsers rolesHasUsers2 = new RolesHasUsers();
        rolesHasUsers2.setId(2L);
        rolesHasUsers2.setUser(user);
        rolesHasUsers2.setRole(role2);

        RolesHasUsers rolesHasUsers3 = new RolesHasUsers();
        rolesHasUsers3.setId(2L);
        rolesHasUsers3.setUser(user);
        rolesHasUsers3.setRole(role2);


        Order order = new Order();
        order.setId(1L);
        order.setDateCreated(new Date());
        order.setDelivery("asdsa a sdsa");
        order.setPayment("sdfdsf dsf ");
        order.setStatus(false);
        order.setClient(client);

        ProductHasOrder productHasOrder = new ProductHasOrder();
        productHasOrder.setId(1L);
        productHasOrder.setProduct(air2020);
        productHasOrder.setOrder(order);
        productHasOrder.setQuantity((short) 1);

        System.out.println(productHasOrder);


    }


}
