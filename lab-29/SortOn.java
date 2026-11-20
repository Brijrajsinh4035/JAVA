import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortOn {
    public static void main(String[] args) {
        java.util.ArrayList<studentdemo> arr = new ArrayList<>();
        System.out.println("Enter Size Array");
        int s = new Scanner(System.in).nextInt();
        for (int i = 0; i < s; i++) {
            studentdemo str = new studentdemo();
            str.setter();
            arr.add(str);
        }

        Collections.sort(arr, (s1, s2) -> Double.compare(s1.StudentSpi, s2.StudentSpi));

        for (studentdemo str : arr) {
            str.getter();
        }
    }
}

class studentdemo {
    int studentid;
    String studentname;
    int StudentRollNo;
    double StudentSpi;
    Scanner sc;

    void setter() {
        sc = new Scanner(System.in);
        System.out.println("enter id");
        studentid = sc.nextInt();
        System.out.println("enter name");
        studentname = sc.next();
        System.out.println("enter roll no");
        StudentRollNo = sc.nextInt();
        System.out.println("enter spi");
        StudentSpi = sc.nextDouble();
    }

    void getter() {
        System.out.println("enter id");
        System.out.println(studentid);
        System.out.println("enter name");
        System.out.println(studentname);
        System.out.println("enter roll no");
        System.out.println(StudentRollNo);
        System.out.println("enter spi");
        System.out.println(StudentSpi);
    }
}
