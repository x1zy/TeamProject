package allclasses.zolina;
import java.util.Random;

public class Snake {
    private String kind;
    private int age;
    private int length;
    private int apple; //Сколько яблок она скормила Еве

    public void randomizeAttributes() {
        Random random = new Random();

        // Массив с пятью видами змей
        String[] kinds = {"Кобра", "Удав", "Гадюка", "Анаконда", "Питон"};

        // Случайный выбор вида змеи
        this.kind = kinds[random.nextInt(kinds.length)];

        // Случайное значение возраста от 1 до 20 лет
        this.age = random.nextInt(20) + 1;

        // Случайная длина от 50 см до 500 см
        this.length = random.nextInt(451) + 50;

        // Случайное количество яблок от 0 до 10
        this.apple = random.nextInt(11);
    }

    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    public int getLength() {
        return length;
    }

    public int getApple() {
        return apple;
    }

    // Для теста
    public static void main(String[] args) {
        Snake snake = new Snake();
        snake.randomizeAttributes();

        System.out.println("Вид змеи: " + snake.getKind());
        System.out.println("Возраст: " + snake.getAge());
        System.out.println("Длина: " + snake.getLength() + " см");
        System.out.println("Количество яблок скормленных Еве: " + snake.getApple());
    }
}
