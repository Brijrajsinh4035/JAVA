
import java.util.Scanner;

public class Simqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.next();
        System.out.println("Enter Second String");
        String str2 = sc.next();
        IsSimqual s1 =new IsSimqual();
        boolean b1 = s1.Simq(str1, str2);
        if(b1){
            System.out.println("String are Simqual");
        }else{
            System.out.println("String are not Simqual");
        }
    }    
}

class IsSimqual {
    boolean Simq(String str1,String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        
        if(l1 != l2) return false;

        int freq[] = new int[26];

        for(int i = 0; i < l1 ; i++)
        {
            int a = str1.indexOf(str1.charAt(i));
            //System.out.println(a);
            freq[a] += 1;

            int b = str2.indexOf(str2.charAt(i));
            freq[b] -= 1;
        //     int flag = 0;
        //     for(int j = 0;j < l2; j++)
        //     {
        //         if(str1.charAt(i) == str2.charAt(j))
        //         {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0) return false;
        }

        for (int i = 0; i < freq.length; i++) {
            //System.out.println(freq[i]);
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
