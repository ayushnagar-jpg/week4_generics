package com.Intermediate.Annotations;
import java.lang.annotation.Annotation;

@SuppressWarnings("unused")
public class AnnotationRetriever {
    public static void main(String[] args) {
        // Get class object
        Class<Book> clazz = Book.class;

        // Check if the class has @Author annotation
        if (clazz.isAnnotationPresent(Author.class)) {
            // Retrieve the annotation
            Author author = clazz.getAnnotation(Author.class);

            // Display the annotation value
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("No @Author annotation present.");
        }
    }
}
