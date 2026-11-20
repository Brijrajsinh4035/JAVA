
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
        System.out.println("Enter Array Size");
        int s = new Scanner(System.in).nextInt();
        for (int i = 0; i < s; i++) {
            int n = new Scanner(System.in).nextInt();
            arr.add(n);
        }
        System.out.println(arr);
    }
}
