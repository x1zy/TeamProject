import allclasses.irinabig.Animal;
import allclasses.irinabig.Cat;
import allclasses.irinabig.Feline;
import allclasses.irinabig.Lion;
import allclasses.petrov.Programmer;
import allclasses.yakimovich.YakimovichClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Демонстрация работы классов пакета irinabig
        try {
            showClassesIrinaBig();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        showClassesPetrov();
        showClassesYakimovich();

    }
    public static void showClassesIrinaBig() throws Exception {
        Feline feline = new Feline();
        System.out.println("Создан объект семейства " + feline.getFamily());
        Animal animal = new Animal();
        System.out.println(animal.getFamily());

        Cat cat = new Cat(feline);
        System.out.println("Объект кошка умеет говорить: " + cat.getSound());
        Lion lion = new Lion("Самец", feline);
        System.out.println("Кошка питается => " + cat.getFood().toString());
        System.out.println("Лев питается => " + lion.getFood().toString());
        System.out.println("Кошачьи питаются => " + feline.getFood("Хищник") .toString());
    }

    public  static void showClassesPetrov() {
        Programmer programmer = new Programmer("Артем", 18);
        programmer.writeCode();
        programmer.drinkCoffee();
        programmer.debugCode();
    }

    public static void showClassesYakimovich() {
        YakimovichClass test = new YakimovichClass();
        System.out.println("Результаты вычислений YakimovichClass:");
        System.out.println("Сумма 5 + 3 = " + test.add(5, 3));
        System.out.println("Разность 10 - 4 = " + test.subtract(10, 4));
        System.out.println("Произведение 6 * 2 = " + test.multiply(6, 2));
        try {
            System.out.println("Деление 10 / 2 = " + test.divide(10, 2));
            System.out.println("Деление 15 / 0 = " + test.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("Четные числа от 0 до 10: " + test.generateEvenNumbers(10));
    }

}