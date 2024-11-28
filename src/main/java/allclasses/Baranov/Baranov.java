package allclasses.Baranov;

public class Baranov {

    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для умножения двух чисел
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Baranov baranov = new Baranov();

        // Пример использования методов
        int sum = baranov.add(5, 3);
        int product = baranov.multiply(5, 3);

        System.out.println("Сумма: " + sum);         // Вывод: Сумма: 8
        System.out.println("Произведение: " + product); // Вывод: Произведение: 15
    }
}
