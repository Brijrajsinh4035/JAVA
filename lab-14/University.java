public class University{
    public static void main(String[] args){
        Student s1 = new Student("xyz","123456780","abc");
        s1.information();
        Person f1 = new Faculty("raj","3920561215","station");
        f1.information();
    }
}

class Person{
    String name;
    String number,address;
      
    Person(String name,String number,String address){
        this.name=name;
        this.number=number;
        this.address=address;
    }

    void information(){
        System.out.println("name "+name);
        System.out.println("number "+number);
        System.out.println("address "+address);
    } 

}

class Student extends Person{
    public Student(String name,String number,String address){
        super(name,number,address);
    }
}

class Faculty extends Person{

    public Faculty(String name,String number,String address) {
        super(name,number,address);
    }
}