import java.util.Scanner;

public class PosCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer number = ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive integer.");
        } else {
            System.out.println(number + " is not a positive integer.");
        }
    }
}
