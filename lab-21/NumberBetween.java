
import java.util.Scanner;

public class NumberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
        if(a<10 || a>50){
            throw new OutOfRange("out of range");
        }else{
            System.out.println("squre: "+a*a);
        }}
        catch(OutOfRange e){
            System.out.println(e.toString());
        }
    }    
}

class OutOfRange extends Exception{

    public OutOfRange(String msg) {
        super(msg);
    }
    
}
