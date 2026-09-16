public class Array{
    public static void main(String[] args){
        int[] a = {0,2,1,5,4,3};
        int[] n = new int[6];

        for(int i=0;i<a.length;i++){
            System.out.println("new values "+a[a[i]]);
            n[i]= a[a[i]];
        }
        for(int s:n){
            System.out.println(s);
        }
    } 
}