
public class Mtitik {

    public static void main(String[] args) {

        // Membuat objek Titik
        Titik t1 = new Titik(3, 4);
        Titik t2 = new Titik(5, 12);

        // Menampilkan titik
        System.out.print("Titik 1: ");
        t1.printTitik();

        System.out.print("Titik 2: ");
        t2.printTitik();

        // Menghitung jarak ke origin
        System.out.println("Jarak Titik 1 ke Origin: " + t1.hitungJarakKeOrigin());
        System.out.println("Jarak Titik 2 ke Origin: " + t2.hitungJarakKeOrigin());
    }
}
