public class Titik {

    // Atribut
    private double absis;
    private double ordinat;

    // Konstruktor
    public Titik(double a, double o) {
        absis = a;
        ordinat = o;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // Setter
    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    // Method untuk menampilkan titik
    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    // Method untuk menghitung jarak ke titik (0,0)
    public double hitungJarakKeOrigin() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
}
