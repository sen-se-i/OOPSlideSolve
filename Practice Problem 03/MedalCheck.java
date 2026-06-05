import java.util.Scanner;

public class MedalCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double letterGrade = input.nextDouble();
        boolean completedSemester = input.nextBoolean();
        if (completedSemester) {
            if (letterGrade >= 3.5) {
                System.out.println("Medal Awarded");
            } else {
                System.out.println("No Medal");
            }
        } else {
            System.out.println("No Medal");
        }
    }
}
