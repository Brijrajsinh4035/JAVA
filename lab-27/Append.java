import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Append {
    public static void main(String[] args)throws IOException{
        FileInputStream fr = new FileInputStream("File1.txt");
        FileOutputStream fw = new FileOutputStream("File2.txt",true);
        int i = 0;
        while((i = fr.read()) != -1){
            fw.write(i);
        }
        System.out.println("file append succsufully");
        fr.close();
        fw.close();
    }    
}
