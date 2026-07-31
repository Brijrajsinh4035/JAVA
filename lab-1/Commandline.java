public class Commandline {
    public static void main(String[] args) {
        byte by = Byte.parseByte(args[1]);
        short s = Short.parseShort(args[1]);
        int a = Integer.parseInt(args[1]);
        long l = Long.parseLong(args[1]);
        Double b = Double.parseDouble(args[2]);
        Float f = Float.parseFloat(args[2]);
        boolean c = Boolean.parseBoolean(args[3]);
        char ch = args[0].charAt(0);

        System.err.println("byte = "+by);
        System.err.println("short = "+s);
        System.err.println("int = "+a);
        System.err.println("long = "+l);
        System.err.println("double = "+b);
        System.err.println("float = "+f);
        System.err.println("boolean = "+c);
        System.err.println("String = "+args[0]);
        System.err.println("char = "+ch);
        
    }    
}
