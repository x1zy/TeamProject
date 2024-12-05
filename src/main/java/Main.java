import allclasses.irinabig.Animal;
import allclasses.irinabig.Cat;
import allclasses.irinabig.Feline;
import allclasses.irinabig.Lion;
import allclasses.tovstogan.Student;
import allclasses.tovstogan.Tovstogan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Демонстрация работы классов пакета irinabig
        try {
            showClassesIrinaBig();
            showClassesTovstogan();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public  static void showClassesIrinaBig() throws Exception {
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
    public static void showClassesTovstogan() {
        Tovstogan T = new Tovstogan();
        Student S = new Student("Имя", "Фамилия", 222);
        // Пример использования методов
        System.out.println(T.returnHello());
        System.out.println(S.getGroup());
    }
}