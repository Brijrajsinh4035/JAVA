import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replace1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("File1.txt");
        int i=0;
        String str = new String();
        while((i = fr.read())!= -1) { 
            str += (char)i;
        }
        String str2 = str.replace("darshan","du");
        System.out.println(str2);
        fr.close();

        FileWriter fw = new FileWriter("File2.txt");
        fw.write(str2);
        fw.close();
    }    
}
