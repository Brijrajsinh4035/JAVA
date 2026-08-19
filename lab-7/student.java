import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        
        s1.setter(101,"raj",8.5,"mca");
        s2.setter(102,"het",8.5,"mca");
        s3.setter(103,"kavan",8.5,"mca");
        s1.getter();
        s2.getter();
        s3.getter();
    }
}

class Students{
    int rno;
    String name;
    Double spi;
    String course;

    void setter(int rno,String name,Double spi,String course){
        
        this.rno = rno;
       
        this.name = name;
        
        this.spi = spi;
        
        this.course = course;
    }

    void getter(){
        System.out.println("Rno "+rno);
        System.out.println("Name "+name);
        System.out.println("Spi "+spi);
        System.out.println("Course "+course);
    }
}
