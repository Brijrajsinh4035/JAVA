public class EmployeeHRMananger {
    public static void main(String[] args) {
        Employee e = new Employee("raj",50000.0);
        HRManager m = new HRManager("abhi",100000.00);
        e.work();
        e.getSalary();
        m.work();
        m.getSalary();
        m.addEmployee();
    }
}
class Employee{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    void work(){
        System.out.println("Employee name "+name);
    }
    void getSalary(){
        System.out.println("salary " +salary);
    }
}

class HRManager extends Employee{
    HRManager(String name,double salary){
        super(name,salary);
    }

    void work(){
        System.out.println("Manager "+name);
    }
    void addEmployee(){
        Employee e2 = new Employee("meet",30000.00);
        e2.work();
        e2.getSalary();
    }
}
