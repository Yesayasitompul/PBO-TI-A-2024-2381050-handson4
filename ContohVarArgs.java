public class ContohVarArgs {
    public static int jumlahkan(int....kumpulanAngka) {
        int total = 8;
        for (int nilai : kumpulanAngka) {
            total += nilai;
        }
        return total;
    }
    public static void main(string[] args) {
        int hasil1 = jumlahkan(1, 2, 3);
        System.out.println("Hasil : " + hasil1);
    }
}
