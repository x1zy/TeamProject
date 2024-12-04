import allclasses.Portov.Person;
import allclasses.fokin.FokinClass;
import allclasses.irinabig.Animal;
import allclasses.irinabig.Cat;
import allclasses.irinabig.Feline;
import allclasses.irinabig.Lion;
import allclasses.petrov.Programmer;
import allclasses.yakimovich.YakimovichClass;
import allclasses.antonov.Bear;
import allclasses.yakovleva.*;
import allclasses.chernyshova.Mouse;
import allclasses.ravilova.RavilovaClass;
import allclasses.zolina.Snake;
import java.time.LocalDate;

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
        showClassesFokin();
        showClassesPortov();
        showClassesVolodin();
        showClassesBezrukih();
        showClassesChernyshova();
        showClassesRavilova();
        showClassesStrelnikov();
        showClassesSmirnova();
        showClassesZolina();

    }
    public static void showClassesIrinaBig() throws Exception {
        System.out.println("\nДемонстрация работы классов Ирины Георгиевны:\n");
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
        System.out.println("\nДемонстрация работы классов Петрова Артёма:\n");
        Programmer programmer = new Programmer("Артем", 18);
        programmer.writeCode();
        programmer.drinkCoffee();
        programmer.debugCode();
    }

    public static void showClassesYakimovich() {
        System.out.println("\nДемонстрация работы класса Якимовича Андрея:\n");
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
    public static void showClassesFokin() {
        System.out.println("\nДемонстрация работы класса Фокина Дениса:\n");
        FokinClass fokinClass = new FokinClass();

        // Выводим сообщение
        fokinClass.printMessage("Привет из группы С224 от Метафоры(Дениса)!");

        // Рассчитываем сумму двух чисел
        int sum = fokinClass.calculateSum(5, 10);
        System.out.println("Сумма 5 и 10 равна: " + sum + ", Ого!");

        // Генерируем массив случайных целых чисел
        int[] randomArray = fokinClass.generateRandomArray(5, 100); // Массив из 5 случайных чисел до 100
        System.out.print("Случайный массив: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку
    }

    public static void showClassesPortov()
    {
        System.out.println("\nДемонстрация работы класса Портова Артёма:\n");
        Person person = new Person("Алексей", 25);

        // Демонстрация работы методов
        person.introduce(); // Вызываем метод представления
        person.haveBirthday(); // Увеличиваем возраст
        person.introduce(); // Проверяем изменения после дня рождения
    }

    public static void showClassesVolodin() {
        System.out.println("\nДемонстрация работы класса Володина Андрея:\n");
    }
    public static void showClassesBezrukih() {
        System.out.println("\nДемонстрация работы класса Безруких Алексея:\n");
    }

    public static void showClassesChernyshova() {
        System.out.println("\nДемонстрация работы классов Чернышовой Софьи:\n");

        // Создаем объект пользовательской мыши
        Mouse customMouse = new Mouse("белая", "полевка", 30.5, LocalDate.of(2023, 11, 1));
        System.out.println("Создан объект пользовательской мыши:");
        customMouse.describeMouse();

        // Проверяем возраст в днях
        System.out.println("\nВозраст пользовательской мыши в днях: " + customMouse.getAgeInDays());

        // Проверка с неверной датой рождения
        System.out.println("\nПопытка установить будущую дату рождения:");
        customMouse.setBirthDate(LocalDate.now().plusDays(1));
        System.out.println("Дата рождения после проверки: " + customMouse.getBirthDate());
    }
    public static void showClassesRavilova() {
        System.out.println("\nДемонстрация работы класса Равиловой:\n");
        RavilovaClass ravilovaClass = new RavilovaClass();

        // Демонстрация метода addNumbers
        System.out.println("Сложение 7 + 5 = " + ravilovaClass.addNumbers(7, 5));

        // Демонстрация метода countWords
        String sentence = "Сегодня вторник, завтра среда";
        System.out.println("Количество слов в строке \"" + sentence + "\" = " + ravilovaClass.countWords(sentence));

        // Демонстрация метода findMax
        int[] numbers = {2, 8, 1, 15, 6};
        System.out.println("Максимальное число в массиве {2, 8, 1, 15, 6} = " + ravilovaClass.findMax(numbers));

        // Демонстрация обработки исключения для findMax
        try {
            System.out.println("Максимальное число в пустом массиве: " + ravilovaClass.findMax(new int[]{}));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void showClassesStrelnikov(){
        System.out.println("\nДемонстрация работы классов Стрельникова Максима:\n");
        // Создаём объект капибары
        Capybara capy = new Capybara("Каппи", 3, 35.5);
        // Тестируем методы
        capy.displayInfo();        // Печатаем информацию
        capy.speak();              // Капибара говорит
        capy.eat(2.0);             // Капибара ест
        capy.swim();               // Капибара плавает
        capy.play(1.5);            // Капибара играет
        capy.growOlder();          // Капибара стареет
        capy.displayInfo();        // Ещё раз печатаем информацию
    }

    public static void showClassesSmirnova(){
        System.out.println("\nДемонстрация работы классов Смирновой Ирины:\n");
        Seal defaultSeal = new Seal();
        defaultSeal.triks();

        Seal customSeal = new Seal("Петя", 5, 24, 100);
        customSeal.triks();
    }

    public static void showClassesZolina(){
        System.out.println("\nДемонстрация работы классов Золиной Виктории:\n");
        // Создаем три змеи
        Snake cobra = new Snake("Кобра", 5, 300, 2);
        Snake python = new Snake("Питон", 3, 250, 5);
        Snake boa = new Snake("Удав", 6, 400, 3);

        // Каждая змея шипит
        cobra.printCharacteristics(); // Вывод характеристик змеи
        cobra.hiss();

        python.printCharacteristics(); // Вывод характеристик змеи
        python.hiss();

        boa.printCharacteristics(); // Вывод характеристик змеи
        boa.hiss();
    }

}