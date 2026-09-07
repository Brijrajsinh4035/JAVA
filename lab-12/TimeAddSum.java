
import java.util.Scanner;

public class TimeAddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time (h:m:s)");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        Time t1 = new Time(h, m, s);
        t1.Sum(t1);    
    }
}

class Time {
    int hour, minute, second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        if (hour > 12 || minute > 60 || second > 60) {
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void Sum(Time t3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add Second");
        int s = sc.nextInt();
        t3.second += s;
        t3 = SecondSum(t3);
        System.out.println("Time after Adding Seconds"+t3.hour + ":" + t3.minute + ":" + t3.second);
        System.out.println("Subtract Second");
        s = sc.nextInt();
        t3.second -= s;
        t3 = SecondSum(t3);
        System.out.println("Time after Subtracting Seconds"+t3.hour + ":" + t3.minute + ":" + t3.second);

    }

    public Time SecondSum(Time t3){
        while (t3.second > 60 || t3.minute > 60 || t3.hour > 12) {
            if (t3.second >= 60) {
                int s = t3.second - 60;
                t3.second = s;
                t3.minute++;
            } else if (t3.minute >= 60) {
                int m = t3.minute - 60;
                t3.minute = m;
                t3.hour++;
            } else if (t3.hour >= 12) {
                int h = t3.hour - 12;
                t3.hour = h;
            }
        }
        return t3;
    }
}
