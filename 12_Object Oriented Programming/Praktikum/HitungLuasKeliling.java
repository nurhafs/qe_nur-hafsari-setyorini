import java.lang.Math;
public class HitungLuasKeliling {

    private static void luasPersegi(int s) {
        int luas = s*s;
        System.out.println("Persegi: "+ luas);
    }

    private static void luasSegitiga(int a, int t) {
        int luas = (a*t)/2;
        System.out.println("Segitiga: "+ luas);
    }

    private static void luasPersegiPanjang(int p, int l) {
        int luas = p*l;
        System.out.println("Persegi Panjang: "+ luas);
    }

    private static void kelilingPersegi(int s) {
        int keliling = 4*s;
        System.out.println("Persegi: "+ keliling);
    }

    private static void kelilingSegitiga(int a, int t) {
        int s3 = (int)Math.sqrt((a*a)+(t*t));
        int keliling = a+t+s3;
        System.out.println("Segitiga: "+ keliling);
    }

    private static void kelilingPersegiPanjang(int p, int l) {
        int keliling = 2*(p+l);
        System.out.println("Persegi Panjang: "+ keliling);
    }
    public static void main (String[] args) {
        System.out.println("Luas");
        luasPersegi(4);
        luasSegitiga(3,4);
        luasPersegiPanjang(7,8);

        System.out.println("Keliling");
        kelilingPersegi(4);
        kelilingSegitiga(3,4);
        kelilingPersegiPanjang(7,8);
    }
}
