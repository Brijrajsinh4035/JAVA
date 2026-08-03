
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius "+t1.FahrenheitToCelsius(sc));
        System.out.println("Fehreenheit "+t1.CelsiusToFahrenheit(sc));
    }

    public double FahrenheitToCelsius(Scanner sc)
    {
        System.out.println("Enter Fehrenheit");
        double f = sc.nextDouble();
        return (f - 32)*5/9;
    }

    public double CelsiusToFahrenheit(Scanner sc)
    {
        System.out.println("Enter Celsius");
        double c = sc.nextDouble();
        return (c/5)*9+32;
    }
}
