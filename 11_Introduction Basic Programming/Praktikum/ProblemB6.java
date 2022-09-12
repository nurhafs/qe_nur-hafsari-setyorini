public class ProblemB6 {
    private static float Mean(float[] numbers) {
        //your code here
        float total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        float mean = total / numbers.length;
        return mean;
    }

    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }
}
