import java.lang.Math;
import java.util.Scanner;

public class OngkosKirim {
    private static void ongkir(int p, int l, int t, int berat) {
        int volume = p*l*t;
        int harga = ((volume / 50) + 1) * 5000;
        if (harga < 5000) {
            harga = 5000;
        }
        // if (berat > 1) {
        //     harga += (berat-1) * 5000; //asumsi untuk setiap kenaikan 1 kg paket akan dikenakan biaya 5000
        // }
        System.out.println("Harga: " + (int)harga);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang = ");
        int p = sc.nextInt();
        System.out.print("Lebar = ");
        int l = sc.nextInt();
        System.out.print("Tinggi = ");
        int t = sc.nextInt();
        System.out.print("Berat = " );
        int berat = sc.nextInt();
        ongkir(p,l,t,berat);
        sc.close();
    }
}
