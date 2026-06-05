public class OddFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
