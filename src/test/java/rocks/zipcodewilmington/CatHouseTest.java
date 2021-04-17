package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test
    public void addTest(){
        CatHouse.clear();
        Cat expectedCat1 = new Cat("Mr. Cat", new Date(), 5);
        Cat expectedCat2 = new Cat("Mrs. Cat", new Date(), 6);

        CatHouse.add(expectedCat1);
        CatHouse.add(expectedCat2);
        Cat actualCat1 = CatHouse.getCatByIndex(0);
        Cat actualCat2 = CatHouse.getCatByIndex(1);


        Assert.assertEquals(expectedCat1, actualCat1);
        Assert.assertEquals(expectedCat2, actualCat2);
    }

    @Test
    public void removeByCatTest(){
        CatHouse.clear();
        Cat beforeFirstCat = new Cat("Mr. Cat", new Date(), 5);
        Cat beforeSecondCat = new Cat("Mrs. Cat", new Date(), 6);
        CatHouse.add(beforeFirstCat);
        CatHouse.add(beforeSecondCat);

        CatHouse.remove(beforeFirstCat);
        Cat afterFirstCat = CatHouse.getCatByIndex(0);

        Assert.assertNotEquals(beforeFirstCat, afterFirstCat);
    }

    @Test
    public void removeByIdTest(){
        CatHouse.clear();
        Cat beforeFirstCat = new Cat("Mr. Cat", new Date(), 5);
        Cat beforeSecondCat = new Cat("Mrs. Cat", new Date(), 6);
        CatHouse.add(beforeFirstCat);
        CatHouse.add(beforeSecondCat);

        CatHouse.remove(5);
        Cat afterFirstCat = CatHouse.getCatByIndex(0);

        Assert.assertNotEquals(beforeFirstCat, afterFirstCat);
    }

    @Test
    public void getCatByIdTest(){
        CatHouse.clear();
        Cat expectedCat1 = new Cat("Mr. Cat", new Date(), 52);
        Cat expectedCat2 = new Cat("Mrs. Cat", new Date(), 62);
        CatHouse.add(expectedCat1);
        CatHouse.add(expectedCat2);

        Cat actualCat1 = CatHouse.getCatById(52);
        Cat actualCat2 = CatHouse.getCatById(62);

        Assert.assertEquals(expectedCat1, actualCat1);
        Assert.assertEquals(expectedCat2, actualCat2);
    }

    @Test
    public void getNumberOfCatsTest(){
        CatHouse.clear();
        Integer expectedNumOfCats = 15;
        for (int i = 0; i < 15; i++) {
            CatHouse.add(AnimalFactory.createCat("", new Date()));
        }

        Integer actualNumOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumOfCats, actualNumOfCats);
    }
}
