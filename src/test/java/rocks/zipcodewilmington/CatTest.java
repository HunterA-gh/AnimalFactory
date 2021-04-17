package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        Cat c1 = new Cat("", new Date(), 0);
        String expectedName = "Mr. Cat";

        c1.setName(expectedName);
        String actualName = c1.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest(){
        Cat c1 = new Cat("", new Date(), 0);
        String expectedSpeak = "meow!";

        String actualSpeak = c1.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void setBirthDateTest(){
        Cat c1 = new Cat("", new Date(), 0);
        Date expectedBirthDate = new Date(18, 0, 1);

        c1.setBirthDate(expectedBirthDate);
        Date actualBirthDate = c1.getBirthDate();

        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void eatTest(){
        Cat c1 = new Cat("", new Date(), 0);
        Integer expectedMealsEaten = 2;

        c1.eat(new Food());
        c1.eat(new Food());
        Integer actualMeatsEaten = c1.getNumberOfMealsEaten();

        Assert.assertEquals(expectedMealsEaten, actualMeatsEaten);
    }

    @Test
    public void getIdTest(){
        Cat c1 = new Cat("", new Date(), 101);
        Integer expectedId = 101;

        Integer actualID = c1.getId();

        Assert.assertEquals(expectedId, actualID);
    }

    @Test
    public void inheritanceTest(){
        Cat c1 = new Cat("", new Date(), 0);

        Assert.assertTrue(c1 instanceof Animal);
        Assert.assertTrue(c1 instanceof Mammal);
    }
}
