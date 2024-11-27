package HrustaliovaTests;

import allclasses.hrustaliova.Rat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RatsTests {

    @Test
    void testRatConstructor() {
        Rat rat = new Rat("TestRat", 100);
        assertEquals("TestRat", rat.getName());
        assertEquals(100, rat.getWeight());
        assertTrue(rat.isHungry()); // Крыса должна быть голодной после создания
    }

    @Test
    void testRatFeed() {
        Rat rat = new Rat("TestRat", 100);
        rat.feed(50);
        assertEquals(150, rat.getWeight());
        assertFalse(rat.isHungry()); // Крыса не должна быть голодной после кормления
    }

    @Test
    void testRatFeedNegativeAmount() {
        Rat rat = new Rat("TestRat", 100);
        rat.feed(-50); //Попытка накормить отрицательным количеством
        assertEquals(100, rat.getWeight()); //Вес не должен измениться
        assertTrue(rat.isHungry()); // Крыса остается голодной
    }


    @Test
    void testRatSetWeightPositive() {
        Rat rat = new Rat("TestRat", 100);
        rat.setWeight(150);
        assertEquals(150, rat.getWeight());
    }

    @Test
    void testRatSetWeightNegative() {
        Rat rat = new Rat("TestRat", 100);
        rat.setWeight(-50); //Попытка установить отрицательный вес
        assertEquals(100, rat.getWeight()); //Вес не должен измениться
    }

    @Test
    void testRatDescribe() {
        Rat rat = new Rat("TestRat", 100);
        assertEquals("Имя: TestRat, Вес: 100, Голодная: true", rat.describe());
        rat.feed(50);
        assertEquals("Имя: TestRat, Вес: 150, Голодная: false", rat.describe());
    }

    @Test
    void testRatGetName() {
        Rat rat = new Rat("TestRat", 100);
        assertEquals("TestRat", rat.getName());
    }

    @Test
    void testRatSetName(){
        Rat rat = new Rat("TestRat", 100);
        rat.setName("NewName");
        assertEquals("NewName", rat.getName());
    }
}
