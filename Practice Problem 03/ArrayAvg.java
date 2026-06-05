import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] values = new double[n];
        for (int i = 0; i < n; i++) {
            values[i] = input.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += values[i];
        }
        double average = sum / n;
        System.out.println(average);
    }
}
