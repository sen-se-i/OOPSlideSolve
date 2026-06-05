import java.util.Scanner;

public class EquiTriArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the side of the equilateral triangle = ");
        double side = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of the equilateral triangle = " + area);
    }
}
