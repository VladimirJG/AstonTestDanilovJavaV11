package Array;

public class NotInteractive {
    public static void main(String[] args) {
        int[] array = {3, 5, 12, 21, 22, 26, 30, 38,54, 112, 321, 1132};

        for (int element:array) {
                System.out.println(element % 3==0);
        }
    }
}
