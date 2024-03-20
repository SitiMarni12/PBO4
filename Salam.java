public class Salam {

    public void salam() {
        System.out.println("Selamat pagi!");
    }

    public void salam(String nama) {
        System.out.println("Selamat pagi, " + nama + "!");
    }

    public static void main(String[] args) {
        Salam salam = new Salam();

        salam.salam(); // Menampilkan "Selamat pagi!"
        salam.salam("Budi"); // Menampilkan "Selamat pagi, Budi!"
    }
}
