package by.epamtraning.autoshop.entity.jb;

public class UserInfo {
    private int id;
    private String name;
    private String surName;
    private int age;
    private String city;

    public UserInfo(){}

    public UserInfo(int id, String name, String surName, int age, String city){
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
