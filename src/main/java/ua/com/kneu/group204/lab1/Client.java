package ua.com.kneu.group204.lab1;

public class Client {

    private Long id;
    private String firstName;
    private String lastName;
    private int phone;
    private short age;
    private String email;

    private Users user;

    public Users getUser() {
        return user;
    }

    public Client(Long id, String firstName, String lastName, int phone, short age, String email, Users user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
        this.user = user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Client() {
    }

    public Client(Long id, String firstName, String lastName, int phone, short age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", user=" + user +
                '}';
    }
}
