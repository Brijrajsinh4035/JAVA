
public class ProducerConsumer2 {
    public static void main(String[] args) {
        Producer p = new Producer();

        producerCun p1 = new producerCun(p,10);
        counsumer c1 = new counsumer(p,10);

        p1.start();
        c1.start();
    }
}

class producerCun extends Thread {
    Producer p;
    int total;

    public producerCun(Producer p, int total) {
        this.p = p;
        this.total = total;
    }

    public void run() {
        try {
            for (int i = 1; i <= total; i++) {
                p.Produces(i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class counsumer extends Thread {
    Producer p;
    int total;

    public counsumer(Producer p,int total) {
        this.p = p;
        this.total = total;
    }

    public void run() {
        try {
            for (int i = 1; i <= total; i++) {
                p.Consumer();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Producer {
    int arr[] = new int[5];
    int in = 0, out = 0, count = 0;

    synchronized public void Produces(int value) {
        while (count == 5) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(Producer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        arr[in] = value;
        in = (in + 1) % 5;
        count++;

        System.out.println("Produces item " + value);
        notify();
    }

    synchronized public void Consumer() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(Producer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }

        System.out.println("counsumer item : " + arr[out]);
        out = (out + 1) % 5;
        count--;
        notify();
    }
}
