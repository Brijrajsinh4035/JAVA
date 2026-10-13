import java.util.Scanner;

public class MargeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        MargeSorts(arr, n);

        System.out.println("After Sorting");
        for(int s:arr){
            System.out.println(s);
        }
    }

    public static void MargeSorts(int arr[],int totalelement){
        if(totalelement<2){
            return;
        }

        int mid = totalelement/2;
        int leftarr[] = new int[mid];
        int rightarr[] = new int[totalelement-mid];

        for(int i=0;i<mid;i++)
            leftarr[i]=arr[i];
        int j=0;
        for(int i=mid;i<totalelement;i++)
            rightarr[j++]=arr[i];

        MargeSorts(leftarr, mid);
        MargeSorts(rightarr,totalelement-mid);

        Merge(arr,leftarr,rightarr,mid,totalelement-mid);
        
    }

    public static void Merge(int arr[],int leftarr[],int rightarr[],int left,int right){
        int i=0,j=0,k=0;

        while(i<left && j<right){
            if(leftarr[i]<=rightarr[j]){
                arr[k++] = leftarr[i++];
            }else{
                arr[k++] = rightarr[j++];
            }
        }

        while (i<left) {
            arr[k++]=leftarr[i++];
        }
        while (j<right) {
            arr[k++]=rightarr[j++];
        }
    }
}
