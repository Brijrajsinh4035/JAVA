public class OddEven {
    public static void main(String[] args) {
        oddevenNumber o1 = new oddevenNumber(true);
        oddevenNumber o2 = new oddevenNumber(false);
        o1.start();
        o2.start();
    }
}

class oddevenNumber extends Thread {
    boolean odd;

    public oddevenNumber(boolean odd) {
        this.odd = odd;
    }

    @Override
    public void run() {
        try {
            if (odd) {
                for (int i = 1; i <= 20; i++) {
                    Thread.sleep(1000);
                    if (i % 2 != 0) {
                        System.out.println(i + " is odd");
                    }
                }
            } else {
                for (int i = 1; i <= 20; i++) {
                    Thread.sleep(2000);
                    if (i % 2 == 0) {
                        System.out.println(i + " is even");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
