package BaranovTest;

import allclasses.Baranov.Baranov;
import org.junit.Test;
import static org.junit.Assert.*;

public class BaranovTest {

    @Test
    public void testAdd() {
        Baranov baranov = new Baranov();
        // Тест на сложение положительных чисел
        assertEquals(8, baranov.add(5, 3));
        // Тест на сложение отрицательных чисел
        assertEquals(-8, baranov.add(-5, -3));
        // Тест на сложение положительного и отрицательного числа
        assertEquals(2, baranov.add(5, -3));
    }

    @Test
    public void testMultiply() {
        Baranov baranov = new Baranov();
        // Тест на умножение положительных чисел
        assertEquals(15, baranov.multiply(5, 3));
        // Тест на умножение отрицательных чисел
        assertEquals(15, baranov.multiply(-5, -3));
        // Тест на умножение положительного и отрицательного числа
        assertEquals(-15, baranov.multiply(5, -3));
    }
}

