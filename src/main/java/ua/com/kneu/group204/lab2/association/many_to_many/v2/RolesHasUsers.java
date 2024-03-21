package ua.com.kneu.group204.lab2.association.many_to_many.v2;

import java.util.Date;

public class RolesHasUsers {

    private Long id;
    private Roles role;
    private User user;
    private Date dateCreated;

    public RolesHasUsers() {
    }

    public RolesHasUsers(Long id, Roles role, User user, Date dateCreated) {
        this.id = id;
        this.role = role;
        this.user = user;
        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "RolesHasUsers{" +
                "id=" + id +
                ", role=" + role +
                ", user=" + user +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
