import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
           int a = Integer.parseInt(args[0]);
           int b = Integer.parseInt(args[1]);
           int c = a/b;
        } catch (NumberFormatException e) {
            System.out.println("Error: "+e.toString());
        } catch (ArithmeticException e){
            System.out.println("Error: "+e.toString());
        }
    }    
}


