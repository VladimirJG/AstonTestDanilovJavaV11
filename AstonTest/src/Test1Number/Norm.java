package Test1Number;

import java.util.Scanner;

public class Norm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Go");
        try {
            double nextDouble = scanner.nextDouble();
        } catch (IllegalArgumentException e) {
            System.out.print("JJJJJJJJ");
        } finally {

            double nextDouble = scanner.nextDouble();
            if (nextDouble % 1 != 0) {
                System.out.println("Nu eba");
            } else if (nextDouble > 7) {
                System.out.println("Hi");
            } else if (nextDouble <= 7) {
                System.out.println("Number " + nextDouble + " is wrong");
            } else if (scanner.hasNext()) {
                System.out.print("Brrr");
            }


        }
    }
}
