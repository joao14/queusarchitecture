package com.lab.litethinking.kafkaconsumer.dto;

import java.io.Serializable;

public class People implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private int age;


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

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
