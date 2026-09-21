public class Hospital{
    public static void main(String[] args){
        Department d1 = new Department();
        d1.display();
    }
}

class HospitalManagement{
    void display(){
        System.out.println("AMS Hospital");
    }
}

class Department extends HospitalManagement{
    @Override
    void display(){
        super.display();
        System.out.println("this is kidney Department");
    }
}