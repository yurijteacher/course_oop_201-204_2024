package ua.com.kneu.group203.lab1;

import java.util.Date;

public class Order {
    private Long id;
    private String delivery;
    private String payment;
    private Date dateCreated;
    private boolean status;
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Order() {
    }

    public Order(Long id, String delivery, String payment, Date dateCreated, boolean status, Client client) {
        this.id = id;
        this.delivery = delivery;
        this.payment = payment;
        this.dateCreated = dateCreated;
        this.status = status;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", delivery='" + delivery + '\'' +
                ", payment='" + payment + '\'' +
                ", dateCreated=" + dateCreated +
                ", status=" + status +
                ", client=" + client +
                '}';
    }
}
