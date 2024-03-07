package ua.com.kneu.group202.lab1;

import java.util.List;

public class Users {
    private Long id;
    private String username;
    private String password;

    private List<UsersHasRoles> rolesList;

    public List<UsersHasRoles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<UsersHasRoles> rolesList) {
        this.rolesList = rolesList;
    }

    public Users() {
    }

    public Users(Long id, String login, String password) {
        this.id = id;
        this.username = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
