import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Seletion(arr);

        System.out.println("After Sorting");
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void Seletion(int arr[]) {
        int n = arr.length;
        int minvalue, minindex;
        for (int i = 0; i < n - 1; i++) {
            minvalue = arr[i];
            minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (minvalue > arr[j]) {
                    minvalue = arr[j];
                    minindex = j;
                }
            }
            arr[minindex] = arr[i];
            arr[i] = minvalue;
        }
    }
}
