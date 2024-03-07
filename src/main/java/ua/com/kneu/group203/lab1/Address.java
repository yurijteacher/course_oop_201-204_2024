package ua.com.kneu.group203.lab1;

public class Address {

    private Long id;
    private String country;
    private String city;
    private String street;
    private String builder;


    public Address() {
    }

    public Address(Long id, String country, String city, String street, String builder) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.builder = builder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", builder='" + builder + '\'' +
                '}';
    }
}
