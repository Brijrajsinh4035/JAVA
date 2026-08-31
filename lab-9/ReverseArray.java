import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array Element " +(i+1));
            int n1 = sc.nextInt();
            arr[i] = n1;
        }
        Reverse r = new Reverse();
        r.ReverseArr(arr);
    }
}

class Reverse{
    void ReverseArr(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");       
        }
    }
}
