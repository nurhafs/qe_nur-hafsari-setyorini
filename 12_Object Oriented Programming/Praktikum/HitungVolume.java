import java.lang.Math;
public class HitungVolume {
    private static void Kubus(int s) {
        int hasil = s*s*s;
        System.out.println("Kubus: " + hasil);
    }

    private static void Balok(int p, int l, int t) {
        int hasil = p*l*t;
        System.out.println("Balok: " + hasil);
    }

    private static void Tabung(int r, int t) {
        final double pi = 3.141592653589793238;
        double hasil = pi*r*r*t;
        System.out.println("Tabung: " + Math.round(hasil));
    }
    public static void main(String[] args) {
        System.out.println("Volume");
        Kubus(10);
        Balok(3,6,10);
        Tabung(7,10);

    }
}
