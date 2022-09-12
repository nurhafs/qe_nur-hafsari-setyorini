import java.util.Scanner;
public class ProblemA3 {
    public static void main (String[] args) {
        int bilangan;


        
        //Process: your solution code here

        Scanner in = new Scanner(System.in);
        bilangan =in.nextInt();
        in.close();
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }

    }
}
