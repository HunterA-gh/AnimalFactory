package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest(){
        String expectedName = "Mr. Dog";
        Date expectedBirthDate = new Date(29971002);
        Integer expectedId = 1;

        Dog d1 = new Dog(expectedName, expectedBirthDate, expectedId);

        String actualName = d1.getName();
        Date actualBirthDate = d1.getBirthDate();
        Integer actualId = d1.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void speakTest(){
        String expectedSpeak = "bark!";
        Dog d1 = new Dog("", new Date(), 0);

        String actualSpeak = d1.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void setBirthDateTest(){
        Dog d1 = new Dog("", new Date(), 0);
        Date expectedBirthDate = new Date(16, 11, 15);

        d1.setBirthDate(expectedBirthDate);
        Date actualBirthDate = d1.getBirthDate();

        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void eatTest(){
        Dog d1 = new Dog("", new Date(), 0);
        Integer expectedMealsEaten = 3;

        d1.eat(new Food());
        d1.eat(new Food());
        d1.eat(new Food());
        Integer actualMeatsEaten = d1.getNumberOfMealsEaten();

        Assert.assertEquals(expectedMealsEaten, actualMeatsEaten);
    }

    @Test
    public void getIdTest(){
        Dog d1 = new Dog("", new Date(), 42);
        Integer expectedId = 42;

        Integer actualID = d1.getId();

        Assert.assertEquals(expectedId, actualID);
    }

    @Test
    public void inheritanceTest(){
        Dog d1 = new Dog("", new Date(), 0);

        Assert.assertTrue(d1 instanceof Animal);
        Assert.assertTrue(d1 instanceof Mammal);
    }
}
