package ua.com.kneu.group201.lib2.association.many_to_many.v2;

import java.util.Set;

public class Role {

    private int id;
    private String name; // User, Manager, Administrator

    public Role() {
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
