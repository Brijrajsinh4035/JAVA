
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorTwoNumber c1 = new CalculatorTwoNumber();
        c1.Opration(sc);
    }
}

class CalculatorTwoNumber {

    int a, b;

    void Opration(Scanner sc) {
        while (true) {
            System.out.println("Enter Two Number ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("1.enter +,-,*,/,% for opration (for exit enter e)");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("sum = " + (a + b));
                    break;
                case '-':
                    System.out.println("sub = " + (a - b));
                    break;
                case '*':
                    System.out.println("mul = " + (a * b));
                    break;
                case '/':
                    System.out.println("div = " + (a / b));
                    break;
                case '%':
                    System.out.println("mod = " + (a % b));
                    break;
                case 'e':
                    return;
                default:
                    System.out.println("Enter valid Opration");
                    break;
            };

        }
    }
}
