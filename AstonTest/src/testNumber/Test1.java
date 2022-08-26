package testNumber;

public class Test1 {
    public static void main(String[] args) {
        double entered_number = 12.2;
        if (entered_number % 1 != 0) {
            System.out.println("Введено дробное число");
        } else if (entered_number <= 7) {
            System.out.println("Введенное число " + entered_number + " не соответствует условиям задачи.");
        } else if (entered_number > 7) {
            System.out.println("Привет");
        }
    }
}
