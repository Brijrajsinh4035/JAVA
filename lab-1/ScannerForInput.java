import java.util.*;
public class ScannerForInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte by = sc.nextByte();
        short s = sc.nextShort();
        int a = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double b = sc.nextDouble();
        String c = sc.next();
        char ch = c.charAt(0);

        boolean d = sc.nextBoolean();
        System.err.println("byte = "+by);
        System.err.println("short = "+s);
        System.err.println("int = "+a);
        System.err.println("long = "+l);
        System.err.println("float = "+f);
        System.err.println("double = "+b);
        System.err.println("string = "+c);
        System.err.println("char = "+ch);
        
        System.err.println("boolean = "+d);
        
    }    
}
