package allclasses.Baranov;


import org.testng.Assert;
import org.testng.annotations.Test;

public class BaranovTest {

    @Test
    public void testAdd() {
        Baranov baranov = new Baranov();
        // Тест на сложение положительных чисел
        Assert.assertEquals(baranov.add(5, 3), 8);
        // Тест на сложение отрицательных чисел
        Assert.assertEquals(baranov.add(-5, -3), -8);
        // Тест на сложение положительного и отрицательного числа
        Assert.assertEquals(baranov.add(5, -3), 2);
    }

    @Test
    public void testMultiply() {
        Baranov baranov = new Baranov();
        // Тест на умножение положительных чисел
        Assert.assertEquals(baranov.multiply(5, 3), 15);
        // Тест на умножение отрицательных чисел
        Assert.assertEquals(baranov.multiply(-5, -3), 15);
        // Тест на умножение положительного и отрицательного числа
        Assert.assertEquals(baranov.multiply(5, -3), -15);
    }
}
