import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Insertion(arr);
        
        System.out.println("After Sorting");
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[++j]=key;
        }
    }

}
