package com.IntermediateTests.com.Intermediate.Annotations.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.Intermediate.Annotations.Author;
import com.Intermediate.Annotations.Book;

public class AnnotationRetrieverTest {

    @Test
    public void testRetrieveAuthorAnnotation() {
        // Get class object
        Class<Book> clazz = Book.class;

        // Ensure @Author annotation is present
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            
            // Verify annotation value
            assertEquals("John Doe", author.name());
        }
    }
}
