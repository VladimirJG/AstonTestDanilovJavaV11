package Test1Number;

public class tryCatch {
    public static void main(String[] args) {
        try  {
            int a = 0;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Barmaley");
        }
    }
}
