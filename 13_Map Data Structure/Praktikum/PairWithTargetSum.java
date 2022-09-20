import java.util.*;

public class PairWithTargetSum {
    private static void pairTarget(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);
        }
        Stack<Integer> numsDsc = new Stack<>();
        for (int i: numbers) {
            numsDsc.add(i);
        }
        Stack<Integer> numsAsc = new Stack<>();
        for (int i: numbers) {
            numsAsc.add(numsDsc.pop());
        }
        for (int i: numbers) {
            numsDsc.add(i);
        }
        int last = numsDsc.pop();
        int first = numsAsc.pop();
        for (int i = 0; i < numbers.length; i++) {
            if ((last + first) != target && !numsAsc.isEmpty()) {
                last = numsDsc.pop();
            } else {break;}
            if ((last + first) != target) {
                first = numsAsc.pop();
            } else {break;}
        }
        List<Integer> indexes = new ArrayList<Integer>();
        indexes.add(numberMap.get(first));
        indexes.add(numberMap.get(last));

        System.out.println(indexes);
    }
    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,6};
        pairTarget(input1, 6);

        int[] input2 = {2, 5, 9, 11};
        pairTarget(input2, 11);
    }
}
