import java.util.Scanner;

public class Vehicledemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v;
        System.out.println("Enter Vehicle name");
        String str = sc.next().toLowerCase();
        if (str.equals("car")) {
            v = new Car();
            v.display();
        } else if (str.equals("bike")) {
            v = new Bike();
            v.display();
        } else if (str.equals("bus")) {
            v = new Bus();
            v.display();
        } else {
            System.out.println("Unknown vehicle type");
        }

    }
}

class Vehicle {
    void display() {

    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("this is car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("this is Bike");
    }
}

class Bus extends Vehicle {
    @Override
    void display() {
        System.out.println("this is Bus");
    }

}