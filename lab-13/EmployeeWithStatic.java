
import java.util.Scanner;


public class EmployeeWithStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails e1 = new EmployeeDetails();
        EmployeeDetails.setCompany(sc);
        e1.setName(sc);
        e1.gettername();
        EmployeeDetails e2 = new EmployeeDetails();
        e2.setName(sc);
        e2.gettername();
    }
}

class EmployeeDetails{
    static String company;
    String name;

    public void setName(Scanner sc){
        System.out.println("Enter Employee Name");
        name = sc.nextLine();
    }

    public static void setCompany(Scanner sc){
        System.out.println("Enter Company Name");
        EmployeeDetails.company = sc.nextLine();
    }

    public void gettername(){
        System.out.println("Company name "+company);
        System.out.println("Employee Name "+name);
    }
}