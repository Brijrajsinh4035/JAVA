
import java.util.Scanner;

public class StringPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.next();
        for(int i = 0;i < str.length();i++){
            for(int j = 0; j <= i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }        
    }    
}

