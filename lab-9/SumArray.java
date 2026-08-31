public class SumArray{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        SumArr a1 = new SumArr();
        System.out.println("sum "+a1.sumA(arr));
    }

}

class SumArr{

    int sumA(int[] a){
        int sum = 0;
        for(int i:a){
            sum += i;
        }
        return sum;
    }
}