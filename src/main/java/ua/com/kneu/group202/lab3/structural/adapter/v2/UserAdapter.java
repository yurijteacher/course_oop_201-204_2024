package ua.com.kneu.group202.lab3.structural.adapter.v2;

import ua.com.kneu.group202.lab3.structural.adapter.v1.UserDetails;

public class UserAdapter extends Users implements UserDetails {
    @Override
    public String setUser() {
        return getUsername();
    }

    @Override
    public String setPass() {
        return getPassword();
    }
}
