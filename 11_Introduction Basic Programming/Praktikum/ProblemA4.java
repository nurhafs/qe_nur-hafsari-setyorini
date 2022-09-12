import java.util.Scanner;
public class ProblemA4 {
    public static void main (String[] args) {
        int bilangan;


        
        //Process: your solution code here

        Scanner in = new Scanner(System.in);
        bilangan =in.nextInt();
        in.close();
        for (int i = bilangan; i >= 1; i--) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }

    }
}
