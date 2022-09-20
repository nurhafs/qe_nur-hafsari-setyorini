import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    private static void removeDuplicates(int[] a) {
        List<Integer> anums = Arrays.stream(a).boxed().collect(Collectors.toList());
        Set<Integer> numset = new HashSet<Integer>(anums);
        System.out.println(numset.size());
    }

    public static void main(String[] args) {
        int[] input1 = {2, 3, 3, 3, 6, 9, 9};
        int[] input2 = {2, 2, 2, 11};
        removeDuplicates(input1);
        removeDuplicates(input2);
    }
}
