package allclasses.petrov;

import java.util.Random;

public class Programmer {
    private String name;
    private int age;
    private int caffeineLevel; // Уровень кофеина в крови (0-100)
    private int linesOfCodeWritten; // Количество написанных строк кода

    // Публичный конструктор
    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
        this.caffeineLevel = 50; // Начальный уровень кофеина
        this.linesOfCodeWritten = 0; // Стартовое значение
    }

    // Метод для написания кода
    public void writeCode() {
        if (caffeineLevel > 10) {
            Random random = new Random();
            int lines = random.nextInt(50) + 1; // Случайное число строк от 1 до 50
            linesOfCodeWritten += lines;
            caffeineLevel -= 10;
            System.out.println(name + " написал " + lines + " строк кода. Уровень кофеина: " + caffeineLevel);
        } else {
            System.out.println(name + " слишком устал. Нужно больше кофе!");
        }
    }

    // Метод для повышения уровня кофеина
    public void drinkCoffee() {
        caffeineLevel = Math.min(100, caffeineLevel + 20);
        System.out.println(name + " выпил кофе. Уровень кофеина: " + caffeineLevel);
    }

    // Метод для отдыха
    public void takeBreak() {
        System.out.println(name + " берет перерыв. Энергия восстанавливается...");
        caffeineLevel = Math.min(100, caffeineLevel + 30);
    }

    // Метод для получения информации о производительности
    public String getPerformance() {
        return name + " написал " + linesOfCodeWritten + " строк кода. Уровень кофеина: " + caffeineLevel;
    }

    // Метод для депурации (исправления ошибок)
    public void debugCode() {
        if (linesOfCodeWritten > 0) {
            int bugsFixed = new Random().nextInt(linesOfCodeWritten / 10 + 1); // Исправляем до 10% кода
            linesOfCodeWritten -= bugsFixed;
            System.out.println(name + " исправил " + bugsFixed + " ошибок. Оставшиеся строки кода: " + linesOfCodeWritten);
        } else {
            System.out.println(name + " нечего исправлять. Начни писать код!");
        }
    }
}