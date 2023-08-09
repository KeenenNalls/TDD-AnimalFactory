package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Test
    public void addCatTest(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat expectedCat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.clear();

        //when
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(0);
        //then
        Assert.assertEquals(expectedCat, actualCat);
    }
    @Test
    public void removeCatTest(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat catHouseCat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(catHouseCat);
        Cat expectedCat = CatHouse.getCatById(0);

        //When
        CatHouse.remove(expectedCat);
        Cat actualCat = CatHouse.getCatById(0);

        //then
        Assert.assertNotEquals(expectedCat, actualCat);
    }
    @Test
    public void removeCatByIdTest(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat catHouseCat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(catHouseCat);
        Cat expectedCat = CatHouse.getCatById(0);

        //When
        CatHouse.remove(0);
        Cat actualCat = CatHouse.getCatById(0);

        //then
        Assert.assertNotEquals(expectedCat, actualCat);
    }
    @Test
    public void getNumberOfCats(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat expectedCat = new Cat(givenName, givenBirthDate, givenId);
        Integer expected = 1;
        CatHouse.clear();
        //when
        CatHouse.add(expectedCat);
        Integer actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
