import java.util.Scanner;

public class QuickSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        QuickSorts(arr,0,n-1);

        System.out.println("After Sorting");
        for(int s:arr){
            System.out.println(s);
        }
    }

    public static void QuickSorts(int[] arr,int start,int end){
        if(start<end){
            int p = Partition(arr,start,end);

            QuickSorts(arr,start,p-1);
            QuickSorts(arr,p+1,end);
        }
    }
    public static int Partition(int arr[],int start,int end){
        int pivot = arr[end];

        int i = (start-1);

        for(int j=start;j<=end;j++){
            if(arr[j]<pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[end] = temp;
        
        return i+1;
    }
}

