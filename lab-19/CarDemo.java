public class CarDemo {
    public static void main(String[] args) {
        Car c = new Swift();
        System.out.println(c);
        c.moveForward();
        c.moveBackward();
        c.applyBreak();
        c.moveLeft();
        c.moveRight();
        Thar t = new Thar();
        System.out.println(t);
        t.moveForward();
        t.moveBackward();
        t.applyBreak();
        t.moveLeft();
        t.moveRight();
    }    
}
interface Car{
    void moveForward();
    void moveBackward();
    void moveLeft();
    public void moveRight();

    default void applyBreak(){
        System.out.println("Break");
    }
}
class Swift implements Car{
    @Override 
    public void moveForward(){
        System.out.println("move forward");
    }
    @Override 
    public void moveBackward(){
        System.out.println("move Backward");
    }
    @Override 
    public void moveRight(){
        System.out.println("turn right");
    }
    @Override 
    public void moveLeft(){
        System.out.println("turn left");
    }
}

class Thar implements Car{
     @Override 
    public void moveForward(){
        System.out.println("move forward");
    }
    @Override 
    public void moveBackward(){
        System.out.println("move Backward");
    }
    @Override 
    public void moveRight(){
        System.out.println("turn right");
    }
    @Override 
    public void moveLeft(){
        System.out.println("turn left");
    }
}