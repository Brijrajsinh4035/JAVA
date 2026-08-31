import java.util.Scanner;

public class RorateAndSearch {
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
        System.out.println("Enter Rorate Number");
        int r = sc.nextInt();
        Rotated r1 = new Rotated();
        r1.rot(arr, r);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("Enter Element For Search");
        int n1 = sc.nextInt();
        r1.bunnerySearch(arr, n1);
    }    
}

class Rotated{
    int[] rot(int[] arr,int r){
        for(int i = 0; i < r; i++){
            int temp = arr[0];
            for(int j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }

    void bunnerySearch(int[] arr,int n){
        int left = 0;
        int right = arr.length-1;
        while(left<=right)
        {
            int mid = left+right/2;
            if(arr[mid]==n){
                System.out.println("found at "+mid);
                break;
            } 
            else if(arr[mid]<n){
                left++;
            }
            else{
                right++;
            }
        }
    }
}
