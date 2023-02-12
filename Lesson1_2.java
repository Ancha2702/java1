import java.util.Scanner;

public class Lesson1_2 {
    public static void main(String[] args) {
        int last = 1000;
        for (int i = 1; i <last ; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 ) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }
    }
}