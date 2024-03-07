package ua.com.kneu.group202.lab1;

public class UsersHasRoles {

    private Long id;
    private Users user;
    private Roles role;

    public UsersHasRoles(Long id, Users user, Roles role) {
        this.id = id;
        this.user = user;
        this.role = role;
    }

    public UsersHasRoles() {
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
        return "UsersHasRoles{" +
                "id=" + id +
                ", user=" + user +
                ", role=" + role +
                '}';
    }
}
