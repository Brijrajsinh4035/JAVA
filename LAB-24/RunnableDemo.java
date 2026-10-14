

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1("run1");
        Runnable1 r2 = new Runnable1("run2");
        r1.start();
        r2.start();
    }    
}

class Runnable1 extends Thread {
    String str;
    public Runnable1(String s) {
        str=s;
    }
    

    public void run(){
        System.out.println("this is "+str);
    }
}
