package ua.com.kneu.group202.lab1;


import java.util.List;

public class Roles {
    private Long id;
    private EnumRoles name;
    private List<UsersHasRoles> rolesList;

    public List<UsersHasRoles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<UsersHasRoles> rolesList) {
        this.rolesList = rolesList;
    }

    public Roles() {
    }

    public Roles(Long id, EnumRoles name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumRoles getName() {
        return name;
    }

    public void setName(EnumRoles name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
