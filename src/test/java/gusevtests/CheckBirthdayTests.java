package gusevtests;

import allclasses.gusev.Student;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckBirthdayTests {

    @ParameterizedTest
    @CsvSource({
            "2025, 3, 23, 0",
            "2009, 12, 8, 0",
            "2006, 12, 8, 1",
            "2004, 12, 8, 2",
            "2000, 12, 8, 4"
    })
    public void checkBirthdayReturnsAgeTest(int year, int month, int day, int expected) {
        LocalDate birthday = LocalDate.of(year, month, day);
        Student student = new Student("Anna", "Mihailova", birthday, "Информационные системы и программирование");
        int result = student.calculateCourse();
        assertEquals(expected, result);
    }
}