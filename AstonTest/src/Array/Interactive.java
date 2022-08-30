package Array;

import java.util.*;

public class Interactive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер числового массива");
        int sizeArray = input.nextInt();
        int array[] = new int[sizeArray];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < sizeArray; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Введенные элементы кратные '3'");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}


