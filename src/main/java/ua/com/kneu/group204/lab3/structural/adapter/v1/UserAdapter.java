package ua.com.kneu.group204.lab3.structural.adapter.v1;

public class UserAdapter extends Users implements  UserDetails{
    @Override
    public String setUser(String name) {
        return getUsername();
    }

    @Override
    public String setPass(String pass) {
        return getPassword();
    }
}
