package entity;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private  int age;
    private String time;

    public User(String name, int age, String time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("name:%s age:%d time:%s",name,age,time);
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
