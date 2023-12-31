package entity;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {


    @Serial
    private static final long serialVersionUID = 4063479856140006094L;
    private String name;
    private  int age;

     private String time;
     private transient String info;

    public User(String name, int age, String time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("name:%s age:%d time:%s",name, age,time);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
