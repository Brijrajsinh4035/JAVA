
import java.util.Scanner;
class VovelAndConstant
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Char");
        String ch = sc.next();
        //char ch = sc.next().charAT(0); 
        //char c= ch.charAt(0);
        A v1 = new A();
        for(int i=0 ; i < ch.length(); i++)
        {
            char c = ch.charAt(i);
            v1.VoveConstant(c);
        }
    }
}
class A
{
    public void VoveConstant(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            System.out.println(c+" Vovel");
        }
        else
        {
            System.out.println(c+" Constant");
        }
    }
}