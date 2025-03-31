package com.Advanced.json;
public class Person {
    private String name;
    private int age;
    private boolean isStudent;

    // Constructor
    public Person(String name, int age, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    // Getters (not necessary for Reflection, but useful for debugging)
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isStudent() { return isStudent; }
}
