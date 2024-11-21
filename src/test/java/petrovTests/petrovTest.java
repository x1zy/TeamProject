package petrovTests;

import allclasses.petrov.Programmer;
import org.junit.Assert;
import org.junit.Test;

public class petrovTest {

    @Test
    public void testInitialValues() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("строк кода: 0"));
        Assert.assertTrue(performance.contains("Уровень кофеина: 50"));
    }

    @Test
    public void testWriteCode() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.writeCode();
        String performance = programmer.getPerformance();
        Assert.assertFalse(performance.contains("строк кода: 0")); // Линии кода увеличиваются
        Assert.assertTrue(performance.contains("Уровень кофеина: 40") ||
                performance.contains("Уровень кофеина: 30")); // Кофеин уменьшается
    }

    @Test
    public void testWriteCodeWithoutCaffeine() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        for (int i = 0; i < 6; i++) { // Израсходовать весь кофеин
            programmer.writeCode();
        }
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("Уровень кофеина: 0")); // Программист устал
        programmer.writeCode(); // Еще попытка
        Assert.assertTrue(performance.contains("строк кода:")); // Код не пишется
    }

    @Test
    public void testDrinkCoffee() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.drinkCoffee();
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("Уровень кофеина: 70")); // Кофеин увеличился
    }

    @Test
    public void testDrinkCoffeeMaxLevel() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.drinkCoffee(); // Уровень кофеина: 70
        programmer.drinkCoffee(); // Уровень кофеина: 90
        programmer.drinkCoffee(); // Уровень кофеина: 100
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("Уровень кофеина: 100")); // Максимальный уровень
    }

    @Test
    public void testTakeBreak() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.takeBreak();
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("Уровень кофеина: 80")); // Восстановленный кофеин
    }

    @Test
    public void testDebugCode() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.writeCode(); // Пишем код
        String beforeDebug = programmer.getPerformance();
        programmer.debugCode(); // Депурация
        String afterDebug = programmer.getPerformance();
        Assert.assertNotEquals(beforeDebug, afterDebug); // Количество строк должно уменьшиться
    }

    @Test
    public void testDebugCodeWithoutCode() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.debugCode(); // Нечего депурить
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("строк кода: 0")); // Количество строк не изменилось
    }
}