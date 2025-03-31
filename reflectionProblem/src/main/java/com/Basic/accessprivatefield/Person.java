package com.Basic.accessprivatefield;
public class Person {
    private int age; // Private field

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Public method to check current age
    public int getAge() {
        return age;
    }
}
