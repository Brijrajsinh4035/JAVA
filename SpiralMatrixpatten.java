import java.util.*;

public class SpiralMatrixpatten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row ");
        int rowend = sc.nextInt();
        System.out.println("Enter Column");
        int colend = sc.nextInt();
        int metrix[][] = new int[rowend][colend];
        colend -= 1;
        rowend -= 1;
        System.out.println("enter metrix");
        for (int i = 0; i <= rowend; i++) {
            for (int j = 0; j <= colend; j++) {
                System.out.print("enter row" + (i + 1) + "col" + (j + 1));
                metrix[i][j] = sc.nextInt();
            }
        }
        int rowstart = 0, colstart = 0;
        ArrayList<Integer> spiral = new ArrayList<>();

        while ((rowstart <= rowend) && (colstart <= colend)) {
            for (int i = colstart; i <= colend; i++) {
                spiral.add(metrix[rowstart][i]);
            }
            rowstart++;

            for (int i = rowstart; i <= rowend; i++) {
                spiral.add(metrix[i][colend]);
            }
            colend--;

            if (rowstart <= rowend) {
                for (int i = colend; i >= colstart; i--) {
                    spiral.add(metrix[rowend][i]);
                }
            }
            rowend--;

            if(colstart <= colend){
                for(int i = rowend; i >= rowstart; i--){
                    spiral.add(metrix[i][colstart]);
                }
            }
            colstart++;
        }
        for(int i = 0; i < spiral.size() ; i++)
            System.out.print(spiral.get(i) + " ");
    }
}