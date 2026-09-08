import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scoreboard s1 = new Scoreboard();
        s1.SetTeamName(sc);
        s1.SetTeamMembers(sc);
        s1.ScoreBoard(sc);
        s1.GetTeam();
        
        Scoreboard s2 = new Scoreboard();
        s2.SetTeamName(sc);
        s2.SetTeamMembers(sc);
        s2.ScoreBoard(sc);
        s2.GetTeam();
        
        Scoreboard s3 = new Scoreboard();
        s3.WinningTeam(s1, s2);
    }
}

class Team {
    HashMap<String, Integer> TeamMember = new HashMap<>();
    String TeamName;

    void SetTeamName(Scanner sc) {
        System.out.println("Enter Team Name ");
        TeamName = sc.nextLine();
    }

    void SetTeamMembers(Scanner sc) {
        System.out.println("Enter Size of Team");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " Player Name ");
            String str = sc.nextLine();
            TeamMember.put(str, 0);
        }

    }

}

class Scoreboard extends Team {

    int TeamScore;
    ArrayList<ArrayList<String>> score = new ArrayList<>();
    int TeamOut,AvgRun;
    int TotalSix, TotalFour;
    String Playname;
    ArrayList<String> players = new ArrayList<>();

    void ScoreBoard(Scanner sc) {
        System.out.println("Enter Overs ");
        int Overs = sc.nextInt();
        String run;
        sc.nextLine();
        int flag = 0;

        for (int i = 0; i < Overs; i++) {
            if (TeamOut > (TeamMember.size())-1) {
                break;
            }
            ArrayList<String> row = new ArrayList<>();
            score.add(row);

            int Balls = 0;
            while (Balls < 6) {
                if (TeamOut > (TeamMember.size())-1) {
                    break;
                }
                if (flag == 0) {
                    System.out.println("Enter Bestman Name ");
                    // sc.nextLine();
                    Playname = sc.nextLine();
                    if(players.contains(Playname)){
                       System.out.println("Player Played Allready");
                        continue; 
                    }
                    if (!TeamMember.containsKey(Playname)) {
                        System.out.println("Enter Valid Team Bestman Name");
                        continue;
                    }
                    flag = 1;
                    players.add(Playname);
                }
                System.out.println("Enter Score for " + (i + 1) + " Over " + (Balls + 1) + " ball ('nb,wb,out')");
                // sc.nextLine();
                run = sc.next();
                if (run.equals("nb") || run.equals("wb")) {
                    row.add(run);
                    continue;
                }
                if (run.equals("out")) {
                    row.add(run);
                    flag = 0;
                    TeamOut++;
                    Balls++;
                    continue;
                }

                int runValue = Integer.parseInt(run);
                if (runValue > 6 || runValue < 0) {
                    System.err.println("Invalid Run");
                    continue;
                }
                if (runValue == 6)
                    TotalSix++;
                if (runValue == 4)
                    TotalFour++;
                TeamScore += runValue;
                TeamMember.put(Playname, TeamMember.get(Playname) + runValue);
                row.add(run);
                Balls++;
            }
            AvgRun = TeamScore/i;
        }
        for (ArrayList<String> row : score) {
            System.out.println(row);
        }
    }

    void GetTeam() {
        System.out.println("Team Name: " + TeamName);

        for (String key : TeamMember.keySet()) {
            System.out.println(key + " " + TeamMember.get(key));
        }

        System.out.println("Total Six "+TotalSix);
        System.out.println("Total Four "+TotalFour);
        System.out.println("Total Out "+TeamOut);
        System.out.println("Avg Run "+AvgRun);
        System.out.println("Team Soure "+TeamScore);
    }

    void WinningTeam(Scoreboard t1,Scoreboard t2){
        System.out.println("Winning Team Name");
        int ScoreDiff = t1.TeamScore - t2.TeamScore;
        if(t1.TeamScore>t2.TeamScore){
            System.out.println(t1.TeamName);
        }
        else{
            System.out.println(t2.TeamName);
        }
        System.out.println("Winning By "+Math.abs(ScoreDiff));
    }
}
