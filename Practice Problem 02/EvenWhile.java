public class EvenWhile {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 20) {
            System.out.print(i);
            if (i < 20) {
                System.out.print(", ");
            }
            i += 2;
        }
        System.out.println();
    }
}
