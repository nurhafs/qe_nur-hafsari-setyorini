import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUnique {
    private static void arrayUnique(int[] a, int[] b) {
        List<Integer> anums = Arrays.stream(a).boxed().collect(Collectors.toList());
        for (int i: b) {
            if (anums.contains(i)) {
                anums.remove(anums.indexOf(i));
            }
        }
        System.out.println(anums);
    }

    public static void main(String[] args) {
        int[] input1_a = {1, 2, 3, 4};
        int[] input1_b = {1, 3, 5, 10, 16};
        int[] input2_a = {3, 8};
        int[] input2_b = {2, 8};

        arrayUnique(input1_a, input1_b);
        arrayUnique(input2_a, input2_b);
    }
}
