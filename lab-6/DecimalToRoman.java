import java.util.Scanner;

public class DecimalToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        DecimalToRoman d1 = new DecimalToRoman();
        System.out.println(d1.ToRoman(n));
    }
    
    public String ToRoman(int n){
        if(n<1)
            return null;
        String str = new String();
        while (n>0) {
            if(n >= 100)
            {
                str += 'c';
                n -= 100;
            }
            else if(n >= 90){
                str += "xc";
                n -= 90; 
            }
            else if(n >= 50){
                str += 'l';
                n -= 50;
            }
            else if(n >= 40){
                str += "xl";
                n -= 40;
            }
            else if(n >= 10){
                str += 'x';
                n -= 10;
            }
            else if(n >= 9){
                str += "ix";
                n -= 9;
            }
            else if(n >= 5){
                str += 'v';
                n -= 5;
            }
            else if(n >= 4){
                str += "iv";
                n -= 4;
            }
            else if(n >= 1){
                str += 'i';
                n -= 1;
            }
        }
        return str;
    }
}