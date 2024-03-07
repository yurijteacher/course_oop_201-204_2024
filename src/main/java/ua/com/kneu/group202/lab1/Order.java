package ua.com.kneu.group202.lab1;

import java.util.Date;

public class Order {

    private Long id;
    private Date dateCreated;
    private Delivery delivery;
    private Payment payment;
    private Client client;
    private boolean status;

    public Order() {
    }

    public Order(Long id, Date dateCreated, Delivery delivery, Payment payment, Client client, boolean status) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.delivery = delivery;
        this.payment = payment;
        this.client = client;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", delivery=" + delivery +
                ", payment=" + payment +
                ", client=" + client +
                ", status=" + status +
                '}';
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

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
