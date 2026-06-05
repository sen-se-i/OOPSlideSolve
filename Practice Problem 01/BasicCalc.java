import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number = ");
        int firstNumber = input.nextInt();

        System.out.print("Please enter the second number = ");
        int secondNumber = input.nextInt();

        System.out.print("Please enter an operator (+, -, *, /) = ");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result = " + (firstNumber + secondNumber));
        } else if (operator == '-') {
            System.out.println("Result = " + (firstNumber - secondNumber));
        } else if (operator == '*') {
            System.out.println("Result = " + (firstNumber * secondNumber));
        } else if (operator == '/') {
            System.out.println("Result = " + (firstNumber / secondNumber));
        } else {
            System.out.println("Invalid operator");
        }
    }
}
