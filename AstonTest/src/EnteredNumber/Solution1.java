package EnteredNumber;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        try {
            var num = scanner.nextDouble();
            if (num % 1 != 0) {
                System.out.println("Введенное число " + num +  " является дробным");
            } else if (num > 7) {
                System.out.println("Привет");
            } else if (num <= 7) {
                System.out.println("Введенное число  " + num + " меньше допустимого к вводу значения");
            }
        } catch (InputMismatchException e) {
            System.out.print("Введенное значение не является числом");
        }
    }
}