import java.util.Scanner;

public class MetrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] metrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = sc.nextInt();
                metrix[i][j] = n;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println();
        }
        SumMetrixRow[] s1 = new SumMetrixRow[metrix.length];

        for (int i = 0; i < metrix.length; i++) {
            s1[i] = new SumMetrixRow(metrix, i, metrix[0].length);
        }

        for (int i = 0; i < metrix.length; i++) {
            s1[i].start();
        }

        for (int i = 0; i < s1.length; i++) {
            try {
                s1[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("end");
    }
}

class SumMetrixRow extends Thread {
    int[][] metrix;
    int row, col;

    SumMetrixRow(int[][] metrix, int row, int col) {
        this.metrix = metrix;
        this.row = row;
        this.col = col;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < col; i++) {
            sum += metrix[row][i];
        }
        System.out.println(row + " row sum is " + sum);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }  
    }
}
