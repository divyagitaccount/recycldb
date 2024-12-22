package com.example.recycl;

public class User {
    private String name;
    private int age;

    // Required empty constructor for Firebase
    public User() { }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
