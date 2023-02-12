import java.util.Scanner;

public class Lesson1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1");
        Long number1 = scanner.nextLong();

        System.out.println("Введите число 2");
        Long number2 = scanner.nextLong();

        System.out.println("Введите операцию: 1- число1 + число2; 2- число1 - число2;3- число1 * число2;4- число1/число2;");
        String operation = scanner.next();

        switch (operation) {
            case "1":
                System.out.println(number1 + number2);
                break;
            case "2":
                System.out.println(number1 - number2);
                break;
            case "3":
                System.out.println(number1 * number2);
                break;
            case "4":
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Неверный ввод");
        }

    }
}