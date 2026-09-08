
import java.util.Scanner;

public class TimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time (h:m:s)");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        Time t1 = new Time(h, m, s);
        System.out.println("Enter Time (h:m:s)");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        Time t2 = new Time(h, m, s);
        Time t3 = t1.Sum(t1, t2);
        System.out.println(t3.hour + ":" + t3.minute + ":" + t3.second);
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
        if (hour < 1 || hour > 12 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            System.out.println("Invalid time entered, defaulting to 0:0:0");
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time Sum(Time t1, Time t2) {
        Time t3 = new Time();
        t3.second = t1.second + t2.second;
        t3.minute = t1.minute + t2.minute;
        t3.hour = t1.hour + t2.hour;
        while (t3.second >= 60 || t3.minute >= 60 || t3.hour >= 12) {
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
