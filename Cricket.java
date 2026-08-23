import java.util.ArrayList;
import java.util.Scanner;

public class Cricket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scoreboard s1= new Scoreboard();
        s1.ScoreBoard(sc);
    }
}
class Scoreboard{
    ArrayList<ArrayList<String>> score = new ArrayList<>();
    void ScoreBoard(Scanner sc){
        System.out.println("Enter Overs");
        int Overs = sc.nextInt();
        String run ;

        for(int i = 0; i < Overs; i++)
        {
            ArrayList<String> row = new ArrayList<>();
            score.add(row);

            int Balls = 0;
            while(Balls < 6)
            {
                System.out.println("Enter Score for "+(i+1)+" Over "+(Balls+1)+" ball ");
                run = sc.next();
                if(run.equals("nb") || run.equals("wb")){
                    row.add(run);
                    continue;
                }        
                if(run.equals("out")){
                    row.add(run);
                    Balls++;
                    continue;
                }

                int runValue = Integer.parseInt(run);
                if(runValue > 6 || runValue < 0) {
                    System.err.println("Invalid Run");
                    continue;
                }            
                row.add(run);
                Balls++;    
            }
        }
        for (ArrayList<String> row : score) {
            System.out.println(row);
        }
    }
}
