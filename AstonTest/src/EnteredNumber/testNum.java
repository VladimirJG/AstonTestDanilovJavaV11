package EnteredNumber;

public class testNum {
    public static void main(String[] args) {
        enteredNumber(6.9);
    }
    private static void enteredNumber(double a) {
// При необходимости сравнения вводимых дробных значений-условие "if" удалить,
// условие "else if (a <= 7)" заменить на "if (a <= 7)".
        if (a % 1 != 0) {
            System.out.println("Введено дробное число " + a);
        } else if (a <= 7) {
            System.out.println("Введенное число " + a + " не соответствует минимально допустимому значению.");
        } else if (a > 7) {
            System.out.println("Привет");
        }
    }
}

