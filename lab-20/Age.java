public class Age {
    public static void main(String[] args) throws AgeException {
        int a = Integer.parseInt(args[0]);
        try {
            if (a < 18) {
                throw new AgeException("age should be greter than 18");
            }
        } catch (AgeException e) {
            System.out.println("Error: " +e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }
}

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}
