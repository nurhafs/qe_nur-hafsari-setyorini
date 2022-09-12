public class ProblemB5 {
    private static String ubahHuruf(String s) {
        //your code here
        //ascii A-Z: 65-90
        char[] kata = s.toCharArray();
        char[] convertedKata = new char[kata.length];
        for (int i = 0; i < kata.length; i++) {
            char huruf = kata[i];
            int ascii = (int)huruf;
            int asciiAdded = 32;
            if (ascii >= 65 && ascii <= 90) {
                asciiAdded = ascii + 10;
            }
            if (asciiAdded > 90) {
                asciiAdded = asciiAdded - 90 + 64;
            }
            char hurufConverted = (char)asciiAdded;
            convertedKata[i] = hurufConverted;
        }
        return String.valueOf(convertedKata);
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));

    }
}
