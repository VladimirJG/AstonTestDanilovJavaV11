package array;

import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class InteractiveDouble {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер числового массива");
        int sizeArray = input.nextInt();
        int array[] = new int[sizeArray];
        System.out.println("Введите элементы массива");
        try {
            for (int i = 0; i < sizeArray; i++) {
                array[i] = (int) input.nextDouble();
            }
            System.out.println("Введенные элементы кратные '3'");
            for (int num : array) {
                if (num % 3 == 0) {
                    System.out.println(num);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Некоторые из введенных значений не соответствует условиям ввода");
        }
    }
}

