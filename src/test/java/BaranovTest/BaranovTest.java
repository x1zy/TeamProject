package BaranovTest;

import allclasses.Baranov.Baranov;

public class BaranovTest {

    public static void main(String[] args) {
        BaranovTest test = new BaranovTest();

        // Запуск тестов
        test.testAdd();
        test.testMultiply();
    }

    public void testAdd() {
        Baranov baranov = new Baranov();

        // Тест на сложение положительных чисел
        if (baranov.add(5, 3) != 8) {
            System.out.println("Ошибка: 5 + 3 должно быть 8");
        } else {
            System.out.println("Тест сложения положительных чисел пройден.");
        }

        // Тест на сложение отрицательных чисел
        if (baranov.add(-5, -3) != -8) {
            System.out.println("Ошибка: -5 + -3 должно быть -8");
        } else {
            System.out.println("Тест сложения отрицательных чисел пройден.");
        }

        // Тест на сложение положительного и отрицательного числа
        if (baranov.add(5, -3) != 2) {
            System.out.println("Ошибка: 5 + (-3) должно быть 2");
        } else {
            System.out.println("Тест сложения положительного и отрицательного числа пройден.");
        }
    }

    public void testMultiply() {
        Baranov baranov = new Baranov();

        // Тест на умножение положительных чисел
        if (baranov.multiply(5, 3) != 15) {
            System.out.println("Ошибка: 5 * 3 должно быть 15");
        } else {
            System.out.println("Тест умножения положительных чисел пройден.");
        }

        // Тест на умножение отрицательных чисел
        if (baranov.multiply(-5, -3) != 15) {
            System.out.println("Ошибка: -5 * -3 должно быть 15");
        } else {
            System.out.println("Тест умножения отрицательных чисел пройден.");
        }

        // Тест на умножение положительного и отрицательного числа
        if (baranov.multiply(5, -3) != -15) {
            System.out.println("Ошибка: 5 * (-3) должно быть -15");
        } else {
            System.out.println("Тест умножения положительного и отрицательного числа пройден.");
        }
    }
}
