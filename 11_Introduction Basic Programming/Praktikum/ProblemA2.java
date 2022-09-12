public class ProblemA2 {
    public static void main(String[] args) {
        //input
        int studentScore = 80;

        //Process
        if (80 <= studentScore || studentScore <= 100) {
            System.out.println("Nilai A");
        }
        else if (65 <= studentScore || studentScore <= 79) {
            System.out.println("Nilai B+");
        }
        else if (50 <= studentScore || studentScore <= 64) {
            System.out.println("Nilai B");
        }
        else if (35 <= studentScore || studentScore <= 49) {
            System.out.println("Nilai C");
        }
        else if (0 <= studentScore || studentScore <= 34) {
            System.out.println("Nilai D");
        }
        else {
            System.out.println("Nilai invalid");
        }
        //output
        //Nilai A
    }
}
