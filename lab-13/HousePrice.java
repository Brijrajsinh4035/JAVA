import java.util.Scanner;

public class HousePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        House h1 = new House();
        h1.setter(sc);
        h1.getter();
        System.out.println("Price Of House "+h1.calculatePrice());
    }
}

class House{
    private String address;
    private int NumberOfRoom;
    private double area;
    private double pricePerSquare;

    public void setter(Scanner sc){
        System.out.println("Enter Address");
        address = sc.nextLine();
        System.out.println("Enter Number Of Room");
        NumberOfRoom = sc.nextInt();
        System.out.println("Enter Area");
        area = sc.nextDouble();
        System.out.println("Enter Price Per Meter");
        pricePerSquare = sc.nextDouble();
    }

    public void getter(){
        System.out.println("Address "+address);
        System.out.println("Number Of Room "+NumberOfRoom);
        System.out.println("Area "+area);
    }

    public double calculatePrice(){
        return area*pricePerSquare;
    }
}
