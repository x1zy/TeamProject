package ChernyshovaTests;
import allclasses.chernyshova.Mouse;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MouseTest {

    @Test
    public void testDefaultMouse() {
        Mouse defaultMouse = new Mouse();

        assertEquals("серая", defaultMouse.getColor(), "Цвет мыши по умолчанию должен быть серым");
        assertEquals("домовая", defaultMouse.getSpecies(), "Вид мыши по умолчанию должен быть 'домовая'");
        assertEquals(25.0, defaultMouse.getWeight(), 0.01, "Вес мыши по умолчанию должен быть 25 грамм");
        assertEquals(LocalDate.now(), defaultMouse.getBirthDate(), "Дата рождения по умолчанию должна быть сегодняшняя");
    }

    @Test
    public void testCustomMouse() {
        LocalDate birthDate = LocalDate.of(2023, 11, 1);
        Mouse customMouse = new Mouse("белая", "полевка", 30.5, birthDate);

        assertEquals("белая", customMouse.getColor(), "Цвет мыши должен быть 'белая'");
        assertEquals("полевка", customMouse.getSpecies(), "Вид мыши должен быть 'полевка'");
        assertEquals(30.5, customMouse.getWeight(), 0.01, "Вес мыши должен быть 30.5 грамм");
        assertEquals(birthDate, customMouse.getBirthDate(), "Дата рождения должна совпадать с заданной");
    }

    @Test
    public void testSetWeight() {
        Mouse mouse = new Mouse();
        mouse.setWeight(-10.0); // Попытка установить отрицательный вес

        assertEquals(25.0, mouse.getWeight(), 0.01, "Вес не должен изменяться на отрицательное значение");
    }

    @Test
    public void testAgeCalculate() {
        LocalDate birthDate = LocalDate.of(2024, 1, 1);
        Mouse mouse = new Mouse("серая", "домовая", 20.0, birthDate);

        long expectedAge = LocalDate.now().toEpochDay() - birthDate.toEpochDay();
        assertEquals(expectedAge, mouse.getAgeInDays(), "Возраст мыши в днях должен быть рассчитан корректно");
    }

    @Test
    public void testSetFalseBirthDate() {
        Mouse mouse = new Mouse();
        LocalDate futureDate = LocalDate.now().plusDays(1);
        mouse.setBirthDate(futureDate); // Попытка установить дату рождения в будущем

        assertNotEquals(futureDate, mouse.getBirthDate(), "Дата рождения не должна быть в будущем");
    }
}
