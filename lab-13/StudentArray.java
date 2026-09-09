import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < s.length; i++){
            s[i] = new Student();
        }
        for(int i = 0; i < s.length; i++){
            s[i].setter(sc);
        }
        Student s1 = new Student();
        s1= s1.HigherMark(s);
        System.out.println("Highest Mark "+s1.mark+" with Student Name "+s1.name);
    }
}
class Student{
    int mark;
    String name;

    public void setter(Scanner sc){
        System.out.println("Enter Student Name");
        name = sc.nextLine();
        System.out.println("Enter Mark");
        mark = Integer.parseInt(sc.nextLine());
    }

    public Student HigherMark(Student[] s1){
        Student s = new Student();
        s = s1[0];
        for(int i = 1; i < s1.length; i++){
            if(s.mark<s1[i].mark){
                s = s1[i];
            }
        }
        return s;
    }
}