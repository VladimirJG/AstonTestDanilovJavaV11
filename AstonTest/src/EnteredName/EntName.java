package EnteredName;

public class EntName {
    public static void main(String[] args) {
        String enteredName = "ВяЧеСлАв";
        if (enteredName.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
