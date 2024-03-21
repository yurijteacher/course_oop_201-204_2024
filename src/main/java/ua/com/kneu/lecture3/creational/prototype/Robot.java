package ua.com.kneu.lecture3.creational.prototype;

public class Robot implements Prototype {

    private Long id;
    private String name;
    private String manuf;

    @Override
    public Robot copy(Long id, String name, String manuf) {
        return new Robot(id, name, manuf);
    }
    public Robot() {
    }

    public Robot(Long id, String name, String manuf) {
        this.id = id;
        this.name = name;
        this.manuf = manuf;
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

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manuf='" + manuf + '\'' +
                '}';
    }


}
