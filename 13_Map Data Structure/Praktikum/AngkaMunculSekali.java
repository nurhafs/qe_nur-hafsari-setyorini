import java.util.*;

public class AngkaMunculSekali {

    private static void angkaSekali(String s) {
        char[] c = s.toCharArray();
        List<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < c.length; i++) {
            chars.add(c[i]);
        }
        List<Character> sekali = new ArrayList<Character>();
        for (Character ch: chars) {
            if (Collections.frequency(chars, ch) == 1) {
                sekali.add(ch);
            }
        }
        System.out.println(sekali);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String angka = sc.nextLine();
        angkaSekali(angka);
        sc.close();
    }
}
