package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void addTest(){
        DogHouse.clear();
        Dog expectedDog1 = new Dog("Mr. Dog", new Date(), 4);
        Dog expectedDog2 = new Dog("Mrs. Dog", new Date(), 2);

        DogHouse.add(expectedDog1);
        DogHouse.add(expectedDog2);
        Dog actualDog1 = DogHouse.getDogByIndex(0);
        Dog actualDog2 = DogHouse.getDogByIndex(1);


        Assert.assertEquals(expectedDog1, actualDog1);
        Assert.assertEquals(expectedDog2, actualDog2);
    }

    @Test
    public void removeByDogTest(){
        DogHouse.clear();
        Dog beforeFirstDog = new Dog("Mr. Dog", new Date(), 4);
        Dog beforeSecondDog = new Dog("Mrs. Dog", new Date(), 2);
        DogHouse.add(beforeFirstDog);
        DogHouse.add(beforeSecondDog);

        DogHouse.remove(beforeFirstDog);
        Dog afterFirstDog = DogHouse.getDogByIndex(0);

        Assert.assertNotEquals(beforeFirstDog, afterFirstDog);
    }

    @Test
    public void removeByIdTest(){
        DogHouse.clear();
        Dog beforeFirstDog = new Dog("Mr. Dog", new Date(), 4);
        Dog beforeSecondDog = new Dog("Mrs. Dog", new Date(), 2);
        DogHouse.add(beforeFirstDog);
        DogHouse.add(beforeSecondDog);

        DogHouse.remove(4);
        Dog afterFirstDog = DogHouse.getDogByIndex(0);

        Assert.assertNotEquals(beforeFirstDog, afterFirstDog);
    }

    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        Dog expectedDog1 = new Dog("Mr. Dog", new Date(), 42);
        Dog expectedDog2 = new Dog("Mrs. Dog", new Date(), 22);
        DogHouse.add(expectedDog1);
        DogHouse.add(expectedDog2);

        Dog actualDog1 = DogHouse.getDogById(42);
        Dog actualDog2 = DogHouse.getDogById(22);

        Assert.assertEquals(expectedDog1, actualDog1);
        Assert.assertEquals(expectedDog2, actualDog2);
    }

    @Test
    public void getNumberOfDogsTest(){
        DogHouse.clear();
        Integer expectedNumOfDogs = 42;
        for (int i = 0; i < 42; i++) {
            DogHouse.add(AnimalFactory.createDog("", new Date()));
        }

        Integer actualNumOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumOfDogs, actualNumOfDogs);
    }
}
