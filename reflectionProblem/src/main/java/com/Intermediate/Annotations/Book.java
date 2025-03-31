package com.Intermediate.Annotations;

//Applying the custom annotation to the class
@Author(name = "John Doe")
public class Book {
 private String title;

 // Constructor
 public Book(String title) {
     this.title = title;
 }

 // Getter method
 public String getTitle() {
     return title;
 }
}
