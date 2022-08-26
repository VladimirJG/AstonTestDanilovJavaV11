package testNumber;

public class Test1_1 {
    public static void main(String[] args) {
        enteredNumber(7.1);
    }

    private static void enteredNumber(double a) {
        try {
            if (a % 1 != 0) {
                System.out.println("Введено дробное число");
            } else if (a <= 7) {
                System.out.println("Введенное число " + a + " не соответствует условиям задачи.");
            } else if (a > 7) {
                System.out.println("Привет");
            }

        } catch (IllegalArgumentException e) {

            System.out.println("Говорили же не делить на ноль!");

        }

    }
}
