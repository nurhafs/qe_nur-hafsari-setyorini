import java.lang.Math;
public class ProblemA5 {
    private static boolean primeNumber(int number) {
        //your code here
        if (number <= 1) {
            return false;
        }
        else if (number == 2) {
            return true;
        }
        else if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
            return true;
    
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
