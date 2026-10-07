public class Arethmetic {
    public static void main(String[] args) {
        // try {
        // System.out.println(10/0);
        // } catch (ArithmeticException e) {
        // System.out.println("divide by 0 "+e.toString());
        // }

        // 2 ----- Array Index Exception -----

        // System.out.println("Enter Size of Array:");
        // int size = sc.nextInt();
        // try {

        // int arr[] = new int[size];
        // arr[8] = 10;

        // } catch (ArrayIndexOutOfBoundsException ae) {

        // System.err.println("Array index out of Bound : " + ae.toString());

        // }

        // 3 ----- Negative Array Size Exception -----

        // System.out.println("Enter Size of Array:");
        // int size = sc.nextInt();

        // try {

        // int arr[] = new int[size];

        // } catch (NegativeArraySizeException nae) {

        // System.err.println("Negative Array Size : " + nae.toString());

        // }

        // 4 ----- String Size Exception -----

        // System.out.println("Enter String:");
        // String s = sc.nextLine();

        // try {

        // System.out.println("String is " + s);
        // System.out.println(s.charAt(8));

        // } catch (StringIndexOutOfBoundsException sie) {

        // System.err.println("String index out of bound : " + sie.toString());

        // }

        // 5 ----- Number Format Exception -----

        // System.out.println("Enter String:");
        // String s = sc.nextLine();

        // try {

        // int a = Integer.parseInt(s);
        // System.out.println("After Converting :"+a);

        // } catch (NumberFormatException ne) {

        // System.err.println(ne.toString());
        // }

        // 6 ----- NULL Pointer Exception -----

        String s = null;

        try {

            System.out.println(s.charAt(8));

        } catch (NullPointerException ne) {

            System.err.println(ne.toString());
        }

    }
}
