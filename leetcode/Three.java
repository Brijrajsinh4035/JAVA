public class Three {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] arr2 = new int[arr.length];
        int i=0;
        int j=3;
        int n=3;
        int flag=0;
        while(i<n){
            if(flag==0){
                arr2[i]=arr[i];
                i++;
                flag=1;
            }
            else if(flag==1){
                arr2[i]=arr[j];
                j++;
                i++;
                flag=0;
            }
        }
        for (int a : arr2) {
            System.out.print(a+" ");
        }
    }    
}
