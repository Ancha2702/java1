import java.util.Scanner;

public class Lesson1_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите число");
        Long number = scanner.nextLong();
        Long factorial = 1L;
        Long triangle = 0L;
        for (int i = 1; i <number+1 ; i++) {
            triangle = i+triangle;
            factorial = i*factorial;

        }
        System.out.println("Треугольное число " + triangle);
        System.out.println("Факториал " + factorial);
    }
}