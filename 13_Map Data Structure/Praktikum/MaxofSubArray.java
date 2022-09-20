import java.util.*;
import java.util.stream.Collectors;

public class MaxofSubArray {
    private static void maxSum(int[] a, int k) {
        List<Integer> nums = Arrays.stream(a).boxed().collect(Collectors.toList());
        Queue<Integer> pickups = new LinkedList<>();
        int sum = 0;
        int total = 0;
        for (int i = 0; i < k; i++) {
            pickups.add(nums.get(i));
            sum += nums.get(i);
            total += nums.get(i);
        }
        for (int t = k; t < nums.size(); t++) {
            sum = sum - pickups.poll() + nums.get(t);
            pickups.add(nums.get(t));
            total = Integer.max(sum, total);

        }
        System.out.println(total);

    }

    public static void main(String[] args) {
        int[] in1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int[] in2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        maxSum(in1, k1);
        maxSum(in2, k2);
    }
}
