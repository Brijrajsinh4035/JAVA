
import java.util.Scanner;

public class AvgArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter Array Element");
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        System.out.println("avg "+AvgArr.AvgA(arr));
    }
}

class AvgArr{
    public static double AvgA(int[] arr){
        double avg = 0,sum = 0;
        for(int i : arr){
            sum += i;
        }
        avg = sum/arr.length;
        return avg;
    }
}
