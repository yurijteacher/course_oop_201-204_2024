package ua.com.kneu.group203.lab1;

import java.util.List;

public class Roles {
    private Long id;
    private String name;
    private List<RolesHasUsers> rolesHasUsersList;

    public Roles() {
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rolesHasUsersList=" + rolesHasUsersList +
                '}';
    }

    public Roles(Long id, String name, List<RolesHasUsers> rolesHasUsersList) {
        this.id = id;
        this.name = name;
        this.rolesHasUsersList = rolesHasUsersList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RolesHasUsers> getRolesHasUsersList() {
        return rolesHasUsersList;
    }

    public void setRolesHasUsersList(List<RolesHasUsers> rolesHasUsersList) {
        this.rolesHasUsersList = rolesHasUsersList;
    }
}
