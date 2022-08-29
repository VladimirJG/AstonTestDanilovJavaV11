package EnteredName;
import java.util.*;
public class EntNameInteractive {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Введите имя");
        String enteredName = sc.next();
        if (enteredName.equalsIgnoreCase("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }
    }
}
