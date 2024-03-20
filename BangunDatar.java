public class BangunDatar {

    public double luas(int sisi) {
        return sisi * sisi; // Luas persegi
    }

    public double luas(int panjang, int lebar) {
        return panjang * lebar; // Luas persegi panjang
    }

    public double luas(double jariJari) {
        return Math.PI * jariJari * jariJari; // Luas lingkaran
    }

    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        System.out.println("Luas persegi dengan sisi 5: " + bangunDatar.luas(5));
        System.out.println("Luas persegi panjang dengan panjang 6 dan lebar 4: " + bangunDatar.luas(6, 4));
        System.out.println("Luas lingkaran dengan jari-jari 7: " + bangunDatar.luas(7));
    }
}
