package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import org.junit.Assert;
import org.junit.Before;

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
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        Integer expected = 1;

        // When
        DogHouse.add(animal);
        Integer actual = DogHouse.getNumberOfDogs();

        // Then
        //DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addDogTest(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog expectedDog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.clear();

        //when
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(0);
        //then
        Assert.assertEquals(expectedDog, actualDog);
    }
    @Test
    public void removeDogTest(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dogHouseDog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dogHouseDog);
        Dog expectedDog = DogHouse.getDogById(0);

        //When
        DogHouse.remove(expectedDog);
        Dog actualDog = DogHouse.getDogById(0);

        //then
        Assert.assertNotEquals(expectedDog, actualDog);
    }
    @Test
    public void removeDogByIdTest(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dogHouseDog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dogHouseDog);
        Dog expectedDog = DogHouse.getDogById(0);

        //When
        DogHouse.remove(0);
        Dog actualDog = DogHouse.getDogById(0);

        //then
        Assert.assertNotEquals(expectedDog, actualDog);
    }


}

