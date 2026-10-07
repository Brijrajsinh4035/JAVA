
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playable p;
        System.out.println("enter sport");
        String str = sc.next().toLowerCase();
        switch (str) {
            case "football":
                p = new Football();
                p.play();
                break;
            case "volleyball":
                p = new Volleyball();
                p.play();
                break;
            case "basketball":
                p = new Basketball();
                p.play();
                break;
            default:
                throw new AssertionError();
        }
        
    }    
}

interface Playable{
    void play();
}

class Football implements Playable{
    @Override 
    public void play(){
        System.out.println("play football");
    }
}
class Volleyball implements Playable{
    @Override 
    public void play(){
        System.out.println("play Valleyball");
    }
}
class Basketball implements Playable{
    @Override 
    public void play(){
        System.out.println("play Basketball");
    }
}
