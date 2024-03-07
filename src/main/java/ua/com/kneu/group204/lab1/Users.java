package ua.com.kneu.group204.lab1;

public class Users {

    private Long id;
    private String login;
    private String pass;

    public Users() {
    }

    public Users(Long id, String login, String pass) {
        this.id = id;
        this.login = login;
        this.pass = pass;
    }

    public Users(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
