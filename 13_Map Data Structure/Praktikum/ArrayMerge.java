import java.util.*;
public class ArrayMerge {
    private static void mergeArray(String[] a, String[] b) {
        ArrayList<String> result = new ArrayList<String>(Arrays.asList(a));
        result.addAll(new ArrayList<String>(Arrays.asList(b)));
        Set<String> uniqueresult = new HashSet<>(result);
        System.out.println(uniqueresult);
    }
    public static void main(String[] args) {

        String[] a = {"kazuya", "jin", "lee"};
        String[] b = {"kazuya", "feng"};
        mergeArray(a, b);
        String[] c = {"lee", "jin"};
        String[] d = {"kazuya", "panda"};
        mergeArray(c, d);
    }
}
