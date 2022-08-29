package enteredName;

import java.util.Scanner;

public class interactiveWithCoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in,"CP866");
        System.out.println ("Введите имя");
        String enteredName = sc.next();
        if (enteredName.equalsIgnoreCase("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }
    }
}
