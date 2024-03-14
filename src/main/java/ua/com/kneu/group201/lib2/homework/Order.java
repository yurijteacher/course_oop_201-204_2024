package ua.com.kneu.group201.lib2.homework;

import java.util.Date;

public class Order {

    private Long id;
    private Date dateCreated;
    private boolean status;
    private Client client;
    private String delivery;
    private String payment;

    public Order() {
    }

    public Order(Long id, Date dateCreated, boolean status, Client client, String delivery, String payment) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.status = status;
        this.client = client;
        this.delivery = delivery;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", status=" + status +
                ", client=" + client +
                ", delivery='" + delivery + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
