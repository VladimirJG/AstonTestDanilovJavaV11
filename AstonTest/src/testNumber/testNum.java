package testNumber;

public class testNum {
    public static void main(String[] args) {
        enteredNumber(7.1);
    }
    private static void enteredNumber(double a) {

        if (a % 1 != 0) {
            System.out.println("Введено дробное число " + a);
        } else if (a <= 7) {
            System.out.println("Введенное число " + a + " не соответствует минимально допустимому значению.");
        } else if (a > 7) {
            System.out.println("Привет");
        }
    }
}

