
import java.util.Scanner;

public class Criket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("enter run");
            int r = sc.nextInt();
            try {
                if(r>6){
                    throw new RunOutofBound("run should not grater than 6");
                }
            } catch (Exception e) {
                System.out.println("Error: "+e.toString());
            }
        }
    }    
}

class  RunOutofBound extends Exception{
    RunOutofBound(String msg){
        super(msg);
    }
}

