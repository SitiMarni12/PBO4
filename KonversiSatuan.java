public class KonversiSatuan {

    public double konversiKeMeter(int cm) {
        return cm / 100.0;
    }

    public double konversiKeMeter(double km) {
        return km * 1000.0;
    }

    public static void main(String[] args) {
        KonversiSatuan konversiSatuan = new KonversiSatuan();

        System.out.println("10 cm dalam meter: " + konversiSatuan.konversiKeMeter(10));
        System.out.println("2 km dalam meter: " + konversiSatuan.konversiKeMeter(2.0));
    }
}
