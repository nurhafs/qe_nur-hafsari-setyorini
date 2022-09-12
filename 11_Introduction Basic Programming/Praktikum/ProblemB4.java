public class ProblemB4 {
    private static void cetakTablePerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print((i + (i*k)));
                if ((i + (i*k)) < 10) {
                    System.out.print("  ");
                }
                else if ((i + (i*k)) >= 10 && (i + (i*k)) < 100 ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }

    }
    public static void main (String[] args) {
        cetakTablePerkalian(9);
    }
}
