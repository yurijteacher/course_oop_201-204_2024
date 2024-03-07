package ua.com.kneu.group202.lab1;

public class Address {
    private Long id;
    private int postIndex;
    private String country;
    private String city;
    private String street;
    private String numberBuilder;
    private Client client;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", postIndex=" + postIndex +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberBuilder='" + numberBuilder + '\'' +
                ", client=" + client +
                '}';
    }

    public Address() {
    }

    public Address(Long id, int postIndex, String country, String city, String street, String numberBuilder, Client client) {
        this.id = id;
        this.postIndex = postIndex;
        this.country = country;
        this.city = city;
        this.street = street;
        this.numberBuilder = numberBuilder;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
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

    public String getNumberBuilder() {
        return numberBuilder;
    }

    public void setNumberBuilder(String numberBuilder) {
        this.numberBuilder = numberBuilder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
