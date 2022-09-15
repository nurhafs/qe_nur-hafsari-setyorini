public class Kalkulator {
    private static void Penjumlahan(int a, int b) {
        System.out.println("Penjumlahan: " + (a+b));
    }

    private static void Pengurangan(int a, int b) {
        System.out.println("Pengurangan: " + (a-b));
    }

    private static void Perkalian(int a, int b) {
        System.out.println("Perkalian: " + (a*b));
    }

    private static void Pembagian(int a, int b) {
        System.out.println("Pembagian: " + (a/b));
    }
    public static void main(String[] args) {
        Penjumlahan(3,4);
        Pengurangan(15,4);
        Perkalian(10,10);
        Pembagian(12,3);
    }
}
