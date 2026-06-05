import java.util.Scanner;

public class BonusCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salesPercentage = input.nextDouble();
        double attendancePercentage = input.nextDouble();
        double bonus;
        if (salesPercentage >= 95 && attendancePercentage == 100) {
            bonus = 60;
        } else if (salesPercentage >= 95 && attendancePercentage >= 90) {
            bonus = 40;
        } else if (salesPercentage >= 80 && attendancePercentage == 100) {
            bonus = 40;
        } else if (salesPercentage >= 80 && attendancePercentage >= 90) {
            bonus = 20;
        } else {
            bonus = 5;
        }
        System.out.println(bonus + "% bonus");
    }
}
