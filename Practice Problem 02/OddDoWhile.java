public class OddDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i);
            if (i < 19) {
                System.out.print(", ");
            }
            i += 2;
        } while (i <= 19);
        System.out.println();
    }
}
