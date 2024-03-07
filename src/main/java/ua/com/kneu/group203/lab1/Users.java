package ua.com.kneu.group203.lab1;

import java.util.List;

public class Users {
    private Long id;
    private String username;
    private String password;

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rolesHasUsersList=" + rolesHasUsersList +
                '}';
    }

    public Users(Long id, String username, String password, List<RolesHasUsers> rolesHasUsersList) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.rolesHasUsersList = rolesHasUsersList;
    }

    private List<RolesHasUsers> rolesHasUsersList;

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

    public List<RolesHasUsers> getRolesHasUsersList() {
        return rolesHasUsersList;
    }

    public void setRolesHasUsersList(List<RolesHasUsers> rolesHasUsersList) {
        this.rolesHasUsersList = rolesHasUsersList;
    }
}
