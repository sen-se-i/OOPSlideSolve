public class EvenDoWhile {
    public static void main(String[] args) {
        int i = 2;
        do {
            System.out.print(i);
            if (i < 20) {
                System.out.print(", ");
            }
            i += 2;
        } while (i <= 20);
        System.out.println();
    }
}
