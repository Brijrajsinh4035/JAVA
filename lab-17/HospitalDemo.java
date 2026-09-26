import java.util.*;
public class HospitalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital h;
        System.out.println("Enter Department name ");
        String str = sc.next().toLowerCase();
        if(str.equals("cardiology")){
            h = new Cardiology();
            h.displayServices();
        }else if(str.equals("neurology")){
            h = new Neurology();
            h.displayServices();
        }else if(str.equals("orthopedics")){
            h = new Orthopedics();
            h.displayServices();
        }else{
            System.out.println("enter valid department of hospital");
        }
    }
}

class Hospital {
    void displayServices() {

    }
}

class Cardiology extends Hospital {
    @Override
    void displayServices() {
        System.out.println("this Cardiology department with dr.xyz");
    }
}

class Neurology extends Hospital {
    @Override
    void displayServices() {
        System.out.println("this Neurology department with dr.xyz");
    }
}

class Orthopedics extends Hospital {
    @Override
    void displayServices() {
        System.out.println("this Orthopedics department with dr.xyz");
    }
}
