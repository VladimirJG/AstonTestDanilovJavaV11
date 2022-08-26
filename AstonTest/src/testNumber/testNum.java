package testNumber;

public class testNum {
    public static void main(String[] args) {
        enteredNumber(8);
    }
    private static void enteredNumber(double a) {

        if (a % 1 != 0) {
            System.out.println("Введено дробное число");
        } else if (a <= 7) {
            System.out.println("Введенное число " + a + " не соответствует условиям задачи.");
        } else if (a > 7) {
            System.out.println("Привет");
        }
    }
}

