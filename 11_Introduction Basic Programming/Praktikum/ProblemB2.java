public class ProblemB2 {
    private static void playWithAsterisk(int n) {
        //your code here
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i+1; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
