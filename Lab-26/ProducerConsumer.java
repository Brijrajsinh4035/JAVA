public class ProducerConsumer {
    public static void main(String[] args) {
        Product p = new Product();
        Producer p1 = new Producer(p);
        Consumer c1 = new Consumer(p);
        c1.start();
        p1.start();
    }    
}

class Product{
    int item;
    boolean isproducing = false;
    
    synchronized void set(int item){
        while(isproducing){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(Product.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        this.item = item;
        System.out.println("set item: "+item);
        notify();
        isproducing = true;
    }
    synchronized int get(){
        while (!isproducing) { 
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(Product.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        notify();
        isproducing = false;
        return item;
    }
}

class Producer extends Thread{
    Product p;
    public Producer(Product p) {
        this.p = p;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            p.set(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.getLogger(Producer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}

class Consumer extends Thread{
    Product p;
    public Consumer(Product p) {
        this.p = p;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("get item: "+p.get());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.getLogger(Producer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}

