package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void createDogTest(){
        String expectedName1 = "Mr. Dog";
        Date expectedBirthDate1 = new Date(10, 02, 13);
        String expectedName2 = "Mrs. Dog";
        Date expectedBirthDate2 = new Date(14, 11, 9);
        Dog d1 = AnimalFactory.createDog(expectedName1, expectedBirthDate1);
        Dog d2 = AnimalFactory.createDog(expectedName2, expectedBirthDate2);

        String actualName1 = d1.getName();
        Date actualBirthDate1 = d1.getBirthDate();
        String actualName2 = d2.getName();
        Date actualBirthDate2 = d2.getBirthDate();

        Assert.assertEquals(expectedName1, actualName1);
        Assert.assertEquals(expectedName2, expectedName2);
        Assert.assertEquals(expectedBirthDate1, actualBirthDate1);
        Assert.assertEquals(expectedBirthDate2, actualBirthDate2);
    }

    @Test
    public void createCatTest(){
        String expectedName1 = "Mr. Cat";
        Date expectedBirthDate1 = new Date(12, 12, 14);
        String expectedName2 = "Mrs. Cat";
        Date expectedBirthDate2 = new Date(18, 1, 1);
        Cat c1 = AnimalFactory.createCat(expectedName1, expectedBirthDate1);
        Cat c2 = AnimalFactory.createCat(expectedName2, expectedBirthDate2);

        String actualName1 = c1.getName();
        Date actualBirthDate1 = c1.getBirthDate();
        String actualName2 = c2.getName();
        Date actualBirthDate2 = c2.getBirthDate();

        Assert.assertEquals(expectedName1, actualName1);
        Assert.assertEquals(expectedName2, expectedName2);
        Assert.assertEquals(expectedBirthDate1, actualBirthDate1);
        Assert.assertEquals(expectedBirthDate2, actualBirthDate2);

    }
}
