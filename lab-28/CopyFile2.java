
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("demo2.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("BufferWriter.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String str;
        while((str = br.readLine()) != null){
            //System.out.println(str);
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        System.out.println("successful");
    }    
}
