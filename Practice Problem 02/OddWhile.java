public class OddWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 19) {
            System.out.print(i);
            if (i < 19) {
                System.out.print(", ");
            }
            i += 2;
        }
        System.out.println();
    }
}
