package irinabigtests;

import allclasses.irinabig.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AnimalTests {
    @Test
    public void testGetFoodReturnsFoodForPredators() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(animal.getFood("Хищник"), List.of("Животные", "Птицы", "Рыба"));
    }
    @Test
    public void testGetFoodReturnsFoodForHerbivore() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(animal.getFood("Травоядное"), List.of("Трава", "Различные растения"));
    }
}
