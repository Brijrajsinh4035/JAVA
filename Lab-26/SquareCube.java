public class SquareCube {
    public static void main(String[] args) {
        random r1 = new random();
        r1.start();
    }
}

class random extends Thread {
    int nums;
    square s;
    cube c;
        
    public void run() {
        while (true) {
            nums = (int) (Math.random() * 10);
            if (nums % 2 == 0) {
                square s = new square(nums);
                s.num = nums;
                s.start();
            } else {
                cube c = new cube(nums);
                c.num = nums;
                c.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class square extends Thread {
    int num;
    square(int num){
        this.num=num;
    }

    public void run() {
        System.out.println("square of " + (num * num));
    }
}

class cube extends Thread {
    int num;
    cube(int num){
        this.num = num;
    }
    
    public void run() {
        System.out.println("cube of " + (num * num * num));
    }
}