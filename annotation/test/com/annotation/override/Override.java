package annotation.override;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Override {

    @Test
    public void testMakeSoundDog() {
        Dog dog = new Dog();
        assertEquals("Dog", dog.makeSound());
    }

    @Test
    public void testMakeSoundAnimalWithDog() {
        Animal animal = new Dog();
        assertEquals("Dog", animal.makeSound());
    }


	@Test
    public void testMakeSoundAnimal() {
        Animal animal = new Animal();
        assertEquals("Animal", animal.makeSound());
    }

}
