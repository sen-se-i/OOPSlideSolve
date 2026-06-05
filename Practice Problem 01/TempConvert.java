import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temperature in Celsius = ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
