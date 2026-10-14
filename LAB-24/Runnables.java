public class Runnables {
    public static void main(String[] args) {

        myclass m1 = new myclass("m1");
        myclass m2 = new myclass("m2");
        myclass m3 = new myclass("m3");

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);

        t1.start();
        t2.start();
        t3.start();
    }
}

class myclass implements Runnable{
    String str;
    public myclass(String s) {
        str = s;
    }
    @Override 
    public void run(){
        System.out.println(str);
    }
}