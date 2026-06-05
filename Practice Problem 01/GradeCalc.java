import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your marks = ");
        int marks = input.nextInt();

        if (marks >= 90) 
            {
            System.out.println("Your grade is A+");
        } 
        else if (marks >= 80) 
            {
            System.out.println("Your grade is A");
        } 
        else if (marks >= 70) 
            {
            System.out.println("Your grade is A-");
        } 
        else if (marks >= 60) 
            {
            System.out.println("Your grade is B");
        } 
        else if (marks >= 40) 
            {
            System.out.println("Your grade is C+");
        } 
        else 
            {
            System.out.println("Your grade is F");
        }
    }
}
