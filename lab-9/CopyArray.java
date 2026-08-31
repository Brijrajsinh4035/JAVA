import java.util.Scanner;

public class CopyArray {
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
        CopyArr a1 = new CopyArr();
        int a[] = a1.CopyA(arr);
        System.out.println("First Array");
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("Copy Array");
        for(int i:a){
            System.out.println(i);
        }
    }    
}

class CopyArr{
    public int[] CopyA(int[] arr){
        int a[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            a[i] = arr[i];
        }
        return a;
    }
}
