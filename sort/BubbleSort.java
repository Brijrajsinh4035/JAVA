import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Bubble(arr);
        
        System.out.println("After Sorting");
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void Bubble(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int flag = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
}
