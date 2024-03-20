abstract class Sayuran {

    protected String nama;

    public abstract void cetakInformasi();

    public void tampilkanWarna() {
        System.out.println("Warna sayuran: ...");
    }
}

class Wortel extends Sayuran {

    public Wortel(String nama) {
        this.nama = nama;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Nama sayuran: " + nama);
        System.out.println("Jenis sayuran: Wortel");
    }

    @Override
    public void tampilkanWarna() {
        System.out.println("Warna: Jingga");
    }
}

class Bayam extends Sayuran {

    public Bayam(String nama) {
        this.nama = nama;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Nama sayuran: " + nama);
        System.out.println("Jenis sayuran: Bayam");
    }

    @Override
    public void tampilkanWarna() {
        System.out.println("Warna: Hijau");
    }
}

public class Main {

    public static void main(String[] args) {
        Sayuran wortel = new Wortel("Baby Carrot");
        wortel.cetakInformasi();
        wortel.tampilkanWarna();

        Sayuran bayam = new Bayam("Merah");
        bayam.cetakInformasi();
        bayam.tampilkanWarna();
    }
}
