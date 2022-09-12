import java.lang.Math;
public class ProblemB3 {

    private static void DrawXYZ(int n) {
        //your code here
        for (int i = 1; i <= Math.pow(n, 2); i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            }
            else if (i % 3 != 0 && i % 2 == 1) {
                System.out.print("Y ");
            }
            else if (i % 3 != 0 && i % 2 == 0) {
                System.out.print("Z ");
            }

            if (i % n == 0) {
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);


    }
}
