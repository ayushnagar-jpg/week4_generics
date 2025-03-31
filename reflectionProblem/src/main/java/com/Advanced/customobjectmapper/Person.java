package com.Advanced.customobjectmapper;
public class Person {
    private String name;
    private int age;
    private String city;

    // Default constructor
    public Person(
    		String name,
    		int age,
    		boolean b
    		) {}

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    // Display info
    public void display() {
        System.out.println("Person{name='" + name + "', age=" + age + ", city='" + city + "'}");
    }
}
