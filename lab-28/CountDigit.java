
import java.io.FileReader;
import java.io.IOException;

public class CountDigit {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader(args[0]);
        int i = 0,count = 0;
        while((i = fr.read())!= -1){
            char c = (char) i;
            if(c == '5'){
                count++;
            }
        }
        System.out.println("count: "+count);
    }    
}
