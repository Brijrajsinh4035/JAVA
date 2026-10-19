public class MultipicationTable {
    public static void main(String[] args) {
        Mutipication m = new Mutipication();
        
        tables table1 = new tables(m, 5, 1);
        tables table2 = new tables(m, 7, 2);
        
        Thread t1 = new Thread(table1);
        Thread t2 = new Thread(table2);
        
        t1.start();
        t2.start();
    }    
}

class tables extends Thread{
    Mutipication m;
    int t;
    int turn;

    tables(Mutipication m,int t,int tur){
        this.m = m;
        this.t = t;
        this.turn = tur;
    }

    public void run(){
        try {
            m.table(t, turn);
        } catch (InterruptedException ex) {
            System.getLogger(tables.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}

class Mutipication{
    int n;
    int turn = 1;

    synchronized public void table(int n,int tableturn) throws InterruptedException{
        while(turn != tableturn){
            wait();
        }

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(500);
            System.out.println(n + " + "+ i + " = " +(n*i));
        }
        turn++;
        notify();
    }
}
