import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }
}
