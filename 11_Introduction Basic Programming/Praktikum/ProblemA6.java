public class ProblemA6 {
    private static boolean palindrome(String value) {
        //your code here
        String temp = "";
        for (int i = value.length(); i > 0; i--) {
            String chara = value.substring(i-1,i);
            temp += chara;
        }

        if (value.equals(temp)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));

    }
}
