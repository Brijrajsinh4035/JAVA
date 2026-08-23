import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];

        for(int i = 0; i < 5;i++){
            ar[i]=i;
        }
        for (int i : ar) {
            System.out.println(i);
        }
        List<String> arr = new ArrayList<>();
        System.out.println("enter size of array");
        int s = sc.nextInt();
        String str; 
        //StringBuilder str = new StringBuilder();
        for(int i = 0; i < s; i++){
            str = sc.next();
            //str.append(st);
            arr.add(str);
        }
        arr.set(1, "100");

        for (String stre : arr) {
            System.out.print(stre +" ");
        }
        System.out.println(arr.get(1));

        List<List<Integer>> twoDarr = new ArrayList<>();
        
        for(int i = 0;i < 3;i++){
            List<Integer> row = new ArrayList<>();
            twoDarr.add(row);
            for(int j = 0; j < 3; j++){
                int n = sc.nextInt();
                row.add(n);
            }
        }
        twoDarr.get(0).set(2, 10);

        for(List<Integer> Arrayl : twoDarr){
            System.out.println(Arrayl);
        }

        System.out.println(twoDarr.get(0).get(2));
    }
}

