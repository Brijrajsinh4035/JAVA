
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Element");
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        MaxMin M1= new MaxMin();
        M1.ArrMaxMin(arr);
    }    
}
class MaxMin{
    void ArrMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int secondmax = arr[0];
        int secondmin = arr[0];
        for(int i = 0;i < arr.length; i++){
            if(max < arr[i]){
                secondmax = max;
                max = arr[i];
            }else if(secondmax < arr[i]){
                secondmax = arr[i];
            }

            if(min > arr[i]){
                secondmin = min;
                min = arr[i];
            }else if(secondmin > arr[i]){
                secondmin = arr[i];
            }
        }
        System.out.println("Max "+max);
        System.out.println("Second Max "+secondmax);
        System.out.println("Min "+min);
        System.out.println("Second Min "+secondmin);
    }
}
