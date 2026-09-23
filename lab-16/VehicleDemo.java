public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.stopEngine();
        Motorcycle m = new Motorcycle();
        m.startEngine();
        m.stopEngine();
    }
}

abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Car is start");
    }
    public void stopEngine(){
        System.out.println("Car is stop");
    }
}

class Motorcycle extends Vehicle{
    public void startEngine(){
        System.out.println("Motorcycle is start");
    }
    public void stopEngine(){
        System.out.println("Motorcycle is stop");
    }
}