package testNumber;

import java.util.*;

public class interactiveInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int entered_number = sc.nextInt();


        if (entered_number > 7) {
            System.out.println("Привет");
        } else if (entered_number <= 7) {
            System.out.println("Введенное число " + entered_number + " меньше допустимого для ввода.");
        }
    }
}