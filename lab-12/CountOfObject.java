public class CountOfObject {
    public static void main(String[] args) {
        Obj o1 = new Obj();
        Obj o2 = new Obj();
        Obj o3 = new Obj();
        Obj o4 = new Obj();
        o1.CountDisplay();
    }    
}

class Obj{
    static int count;

    public Obj() {
        count++;
    }
    
    public void CountDisplay(){
        System.out.println("Count "+count);
    }
}
