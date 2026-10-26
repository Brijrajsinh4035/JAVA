import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Student {
    public static void main(String[] args)throws IOException{
        addStudent();
        studentread();
    }   

    public static void addStudent()throws IOException{
        Scanner sc = new Scanner(System.in);
        FileOutputStream fw = new FileOutputStream("Student.txt",true);
        FileOutputStream fw2 = new FileOutputStream("Marks.txt",true);
        System.out.println("Enter Roll No");
        String rno = sc.next();
        System.out.println("Enter Name ");
        String name = sc.next();
        int marks[] = new int[3];
        
        int sum = 0;
       
        for(int i=0;i<3;i++){
            System.out.println("enter Marks "+(i+1)+" subject");
            int n = sc.nextInt();
            marks[i] = n;
            sum += n;
        }
        String s1 = new String();
        for(int i=0;i<3;i++){
            s1 += String.valueOf(marks[i]) + " ";
        }
        System.out.println(s1);
        double per = (double)sum*100/300 ;
        String pers = String.valueOf(per);
        

        fw.write(rno.getBytes());
        fw.write(" | ".getBytes());
        fw.write(name.getBytes());
        fw.write(" | ".getBytes());
        fw.write(s1.getBytes());
        fw.write(" \n".getBytes());
        
        
        fw2.write(rno.getBytes());
        fw2.write(" | ".getBytes());
        fw2.write(pers.getBytes());
        fw2.write(" \n".getBytes());
        fw.close();
        fw2.close();
    }   
    public static void studentread()throws IOException{
        FileInputStream fr = new FileInputStream("Student.txt");
        int i = 0; 
        while((i = fr.read()) != -1){
            System.out.print((char) i);
        }
    }
}
