public class ProblemB1 {
    private static int pangkat(int a, int b) {
        int total = 1;
        for (int i = 1; i <= b; i++) {
            total = total * a;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));
    }
}
