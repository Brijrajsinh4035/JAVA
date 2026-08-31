import java.util.Scanner;

public class ArrayMethod {
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
        System.out.println("Enter Search Element");
        int s = sc.nextInt();

        System.out.println("Array");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum Of Array "+Method.sumA(arr));
        System.out.println("Avg Of Array "+Method.AvgA(arr));
        System.out.println("Search Element Found On Position "+Method.SearchA(arr, s));
        arr = Method.SortA(arr);
        System.out.println("Sorted Array");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}

class Method{
    public static double AvgA(int[] arr){
        double avg = 0,sum = 0;
        for(int i : arr){
            sum += i;
        }
        avg = sum/arr.length;
        return avg;
    }

    public static int sumA(int[] a){
        int sum = 0;
        for(int i:a){
            sum += i;
        }
        return sum;
    }

    public static int SearchA(int[] a,int s){
        for(int i = 0; i < a.length; i++){
            if(s==a[i]){
                return i+1;
            }
        }
        return -1;
    } 

    public static int[] SortA(int[] a){
        int min;
        int minindex;
        for(int i = 0; i < a.length; i++){
            min = a[i];
            minindex = i;
            
            for(int j = i + 1; j < a.length; j++){
                if(min>a[j]){
                    min = a[j];
                    minindex = j;
                }
            }
            a[minindex] = a[i];
            a[i] = min;  
        }
        return a;
    }
}
