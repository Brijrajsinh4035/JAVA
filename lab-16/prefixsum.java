public class prefixsum {
    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        int[] n1 = {1,2,3,4};
        int sum = 0;
        for(int i=0;i<n.length;i++){
            sum += n[i];
            n1[i]=sum;
        }
        for(int r:n1){
            System.out.println(r);
        }
    }    
}
