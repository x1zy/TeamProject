package ZolinaTest;

import allclasses.zolina.Snake;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SnakeTest {

    // Помощник для доступа к приватным полям
    private Object getFieldValue(Object obj, String fieldName) {
        try {
            var field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testSnakeRandomizeAttributes() {
        Snake snake = new Snake();
        snake.randomizeAttributes();

        String kind = (String) getFieldValue(snake, "kind");
        int age = (int) getFieldValue(snake, "age");
        int length = (int) getFieldValue(snake, "length");
        int apple = (int) getFieldValue(snake, "apple");

        // Проверяем, что значения находятся в допустимых пределах
        Assert.assertNotNull(kind);
        Assert.assertTrue("Возраст должен быть от 1 до 20", age >= 1 && age <= 20);
        Assert.assertTrue("Длина должна быть от 50 до 500 см", length >= 50 && length <= 500);
        Assert.assertTrue("Количество яблок должно быть от 0 до 10", apple >= 0 && apple <= 10);
    }

    @Test
    public void testSnakeBehaviorWithNoApples() {
        Snake snake = new Snake();
        snake.randomizeAttributes();
        // Установим количество яблок на 0 для проверки
        setFieldValue(snake, "apple", 0);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        System.out.printf("%s не скормил яблок Еве.\n", snake.getKind());

        String output = outContent.toString().trim();
        Assert.assertTrue(output.contains("не скормил яблок Еве."));
    }

    @Test
    public void testSnakeBehaviorWithManyApples() {
        Snake snake = new Snake();
        snake.randomizeAttributes();
        // Установим количество яблок на 10
        setFieldValue(snake, "apple", 10);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        System.out.printf("%s скормил слишком много яблок.\n", snake.getKind());

        String output = outContent.toString().trim();
        Assert.assertTrue(output.contains("скормил слишком много яблок."));
    }

    private void setFieldValue(Object obj, String fieldName, Object value) {
        try {
            var field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(obj, value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
