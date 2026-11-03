
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args)throws IOException {
        FileInputStream fr = new FileInputStream("demo.txt");
        BufferedInputStream br = new BufferedInputStream(fr);
        FileOutputStream fw = new FileOutputStream("BufferStreamCopy.txt");
        BufferedOutputStream bw = new BufferedOutputStream(fw);
        int i = 0;
        while ((i = br.read())!= -1) { 
            bw.write(i);
        }
        bw.close();
    }
}
