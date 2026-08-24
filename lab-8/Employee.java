
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s1 = new Salary("kavan", "jr.devloper", 15000);
        System.out.println("Total Salary "+s1.calalateSalary());
        System.out.println("Enter New Salary");
        double salary = sc.nextDouble();
        s1.UpdateSalary(salary);
    }    
}

class Salary{
    public String name, jobTitle;
    private double salary;

    public Salary(String name,String jobTitle,double salary) {
        if(salary < 0){
            System.exit(0);
        }
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    } 
    
    double calalateSalary(){
        return salary * 12.0;
    }

    void UpdateSalary(double newSalary){
        if(salary < 0){
            System.exit(0);
        }
        this.salary = newSalary;
        System.out.println("New Salary "+this.salary);
    }
}
