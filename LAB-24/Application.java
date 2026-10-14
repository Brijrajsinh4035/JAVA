
public class Application {
    public static void main(String[] args) {
        Msg m1 = new Msg("Good Morning", -1000);
        Msg m2 = new Msg("Good Afternoon", 3000);
        m1.start();
        m2.start();
    }
}

class Msg extends Thread {
    String str;
    int time;

    public Msg(String s, int t) {
        str = s;
        time = t;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(time);
                System.out.println(str);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
