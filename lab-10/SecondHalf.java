
import java.util.Scanner;

public class SecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.next();
        secondH s1 = new secondH();
        s1.second(str);
    }    
}

class secondH{
    void second(String str){
        int l = str.length();
        l = l / 2;
        for (int i = l; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
