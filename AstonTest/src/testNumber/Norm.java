package testNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Norm {

    public static void main(String[] args) {
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