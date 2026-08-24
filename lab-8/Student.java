
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark");
        int mark = sc.nextInt();
        Placement p1 = new Placement(mark);
        p1.eligible();
    }    
}

class Placement{
    private int mark;
    public Placement(int mark) {
        if(!(mark >= 0 && mark <= 100)){
            System.out.println("Enter Valid Mark");
            System.exit(0);
        }
        this.mark = mark;
    }

    void eligible(){
        if(mark > 75){
            System.out.println("Eligible for Placement");
        }
        else{
            System.out.println("Not Eligible For Placement");
        }
    }
    
}
