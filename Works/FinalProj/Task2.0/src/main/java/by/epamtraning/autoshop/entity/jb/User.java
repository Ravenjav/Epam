package by.epamtraning.autoshop.entity.jb;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private int id;
    private String login;
    private String password;
    private int access;

    public User(){
        id = 0;
        this.login = "";
        this.password = "";
    }

    public User(int id, String login, String password, int access){
        this.id = id;
        this.login = login;
        this.password = password;
        this.access = access;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && access == user.access && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, access);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", access=" + access +
                '}';
    }
}
