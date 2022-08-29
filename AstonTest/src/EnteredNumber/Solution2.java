package EnteredNumber;

import java.util.Locale;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            if (num % 1 != 0) {
                System.out.println("Введенное число " + num + " является дробным");
            } else if (num > 7) {
                System.out.println("Привет");
            } else if (num <= 7) {
                System.out.println("Введенное число  " + num + " меньше допустимого к вводу значения");
            }
        } else {
            System.out.println("Введенное значение не является числом");
        }
    }
}