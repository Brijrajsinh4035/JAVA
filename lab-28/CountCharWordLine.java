import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCharWordLine {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        BufferedReader br = new BufferedReader(fr);
        int linecount = 0, charcount = 0, wordcount = 0;
        String str;
        while ((str = br.readLine()) != null) { 
            linecount++;
            String[] arr = str.split(" ");
            wordcount = wordcount + arr.length;
            for(Character c: str.toCharArray()){
                charcount++;
            }
        }
        System.out.println("Line Count: "+linecount);
        System.out.println("Word Count: "+wordcount);
        System.out.println("char Count: "+charcount);
    }    
}
