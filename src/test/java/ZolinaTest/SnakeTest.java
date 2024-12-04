package ZolinaTest;

import allclasses.zolina.Snake;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SnakeTest {

    @Test
    public void testSnakeDefaultConstructor() {
        Snake snake = new Snake();
        Assert.assertEquals("Удав", getFieldValue(snake, "kind"));
        Assert.assertEquals(2, getFieldValue(snake, "age"));
        Assert.assertEquals(60, getFieldValue(snake, "length"));
        Assert.assertEquals(1, getFieldValue(snake, "apple"));
    }

    @Test
    public void testSnakeParameterizedConstructor() {
        Snake snake = new Snake("Кобра", 5, 150, 3);
        Assert.assertEquals("Кобра", getFieldValue(snake, "kind"));
        Assert.assertEquals(5, getFieldValue(snake, "age"));
        Assert.assertEquals(150, getFieldValue(snake, "length"));
        Assert.assertEquals(0, getFieldValue(snake, "apple")); // Default value for apple in constructor
    }

    @Test
    public void testHissMethod() {
        Snake snake = new Snake("Кобра", 3, 100, 0);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        snake.hiss();

        String expectedOutput = "Шшшш...";
        Assert.assertTrue(outContent.toString().trim().contains(expectedOutput));
    }

    // Вспомогательный метод для доступа к приватным полям через reflection
    private Object getFieldValue(Object obj, String fieldName) {
        try {
            java.lang.reflect.Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}