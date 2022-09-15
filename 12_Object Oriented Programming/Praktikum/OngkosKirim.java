import java.lang.Math;
import java.util.Scanner;

public class OngkosKirim {
    private static void ongkir(double p, double l, double t, double berat) {
        double volume = p*l*t;
        double harga = ((volume / 50) + (berat / 1)) * 2500;
        if (harga < 5000) {
            harga = 5000;
        }
        System.out.println("Harga: " + (int)harga);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang = ");
        double p = sc.nextDouble();
        System.out.print("Lebar = ");
        double l = sc.nextDouble();
        System.out.print("Tinggi = ");
        double t = sc.nextDouble();
        System.out.print("Berat = " );
        double berat = sc.nextDouble();
        ongkir(p,l,t,berat);
    }
}
