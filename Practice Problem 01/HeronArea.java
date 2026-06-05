import java.util.Scanner;

public class HeronArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first side of the triangle = ");
        double firstSide = input.nextDouble();

        System.out.print("Please enter the second side of the triangle = ");
        double secondSide = input.nextDouble();

        System.out.print("Please enter the third side of the triangle = ");
        double thirdSide = input.nextDouble();

        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));

        System.out.println("Area of the triangle = " + area);
    }
}
