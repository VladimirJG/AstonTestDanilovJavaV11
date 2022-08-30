package Array;

public class NotInteractiveDouble {
    public static void main(String[] args) {
        double[] array = {3, 5, 12, 21.3, 22, 26, 30.15, 38, 54, 112.285, 321, 1132};
        for (double num : array) {
            if (num % 3 == 0) {
                System.out.println((int) num);
            }
        }
    }
}