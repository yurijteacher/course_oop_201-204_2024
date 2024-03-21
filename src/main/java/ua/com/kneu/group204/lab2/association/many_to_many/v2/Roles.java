package ua.com.kneu.group204.lab2.association.many_to_many.v2;

import java.util.Set;

public class Roles {

    private Long id;
    private String name;  // User / Admin / Manager

    public Roles(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Set<RolesHasUsers> rolesHasUsers;

    public Set<RolesHasUsers> getRolesHasUsers() {
        return rolesHasUsers;
    }

    public void setRolesHasUsers(Set<RolesHasUsers> rolesHasUsers) {
        this.rolesHasUsers = rolesHasUsers;
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

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
