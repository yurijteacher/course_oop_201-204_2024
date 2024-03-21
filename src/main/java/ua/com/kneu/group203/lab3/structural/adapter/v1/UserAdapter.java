package ua.com.kneu.group203.lab3.structural.adapter.v1;

public class UserAdapter extends User implements UserDetails {
    @Override
    public String setUser() {
        return getUsername();
    }

    @Override
    public String setPass() {
        return getPassword();
    }
}
