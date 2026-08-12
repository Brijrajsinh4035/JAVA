
import java.util.Scanner;

public class RomanToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Number ");
        String str = sc.next();
        RomanToDecimal r1 = new RomanToDecimal();
        System.out.println("Decimal = " + r1.Todecimal(str));
    }

    public int Todecimal(String str) {
        str = str.toLowerCase();
        int n = str.length(), i = 0, result = 0;
        String str2 = new String();
        for (i = n - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        i = 0;
        while (i < n) {
            switch (str.charAt(i)) {
                case 'i':
                    result += 1;
                    break;
                case 'v':
                    if (i > 0) {
                        if (str.charAt(i - 1) == 'i') {
                            result -= 2;
                        }
                    }
                    result += 5;
                    break;
                case 'x':
                    if(i > 0){
                        if(str.charAt(i - 1) == 'i'){
                            result -= 2;
                        }
                    }
                    result += 10;
                    break;
                case 'l':
                    if(i > 0){
                        if(str.charAt(i-1) == 'x'){
                            result -= 20;
                        }
                    }
                    result += 50;
                    break;
                case 'c':
                    if(i > 0){
                        if(str.charAt(i-1) == 'x'){
                            result -= 20;
                        }
                    }
                    result += 100;
                    break;
                default:
                    System.out.println("Enter Valid Roman Number");
                    break;
            }
            i++;
        }

        return result;
    }
}
