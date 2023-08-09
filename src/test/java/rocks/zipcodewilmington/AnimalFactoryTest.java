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
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        //given
        String expectedName = "Spot";
        Date expectedBirthdate = new Date(2000, 11, 11);
        //when
        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthdate);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthDate);
    }
    @Test
    public void createCatTest(){
        //given
        String expectedName = "Kitty";
        Date expectedBirthdate = new Date(2000, 11, 11);
        //when
        Cat cat = AnimalFactory.createCat(expectedName, expectedBirthdate);
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();
        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthDate);
    }

}
