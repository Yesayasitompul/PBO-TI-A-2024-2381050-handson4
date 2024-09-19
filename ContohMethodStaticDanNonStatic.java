import java.security.PublicKey;

public class ContohMethodStaticDanNonStatic {
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi( sisi: 20);
        System.out.println("Luas Persegi: " + luasPersegi);

        ContohMethodStaticDanNonStatic object = new ContohMethodStaticDanNonStatic();
        object.tampilkanPesanSelamatDatang("Yesaya Sitompul");

    }
    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat Datang, " + nama + " !");
    }
}
