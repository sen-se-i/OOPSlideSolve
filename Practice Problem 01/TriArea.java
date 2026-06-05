import java.util.Scanner;

public class TriArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the base of the triangle = ");
        double base = input.nextDouble();

        System.out.print("Please enter the height of the triangle = ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of the triangle = " + area);
    }
}
