package ua.com.kneu.group203.lab1;

public class RolesHasUsers {
    private Long id;
    private Users user;
    private Roles role;

    public RolesHasUsers() {
    }
    public RolesHasUsers(Long id, Users user, Roles role) {
        this.id = id;
        this.user = user;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RolesHasUsers{" +
                "id=" + id +
                ", user=" + user +
                ", role=" + role +
                '}';
    }
}
