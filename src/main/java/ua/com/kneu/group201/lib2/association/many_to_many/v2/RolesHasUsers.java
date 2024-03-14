package ua.com.kneu.group201.lib2.association.many_to_many.v2;

public class RolesHasUsers {

    private int id;
    private User user;
    private Role role;

    public RolesHasUsers() {
    }

    public RolesHasUsers(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
