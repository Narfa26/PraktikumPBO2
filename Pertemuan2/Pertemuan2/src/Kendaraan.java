// ============================================================
// CLASS KENDARAAN
// Class ini menyimpan data kendaraan milik mahasiswa.
// Jenis kendaraan hanya boleh "motor" atau "mobil".
// ============================================================

public class Kendaraan {

    // -------------------- ATRIBUT --------------------

    private String noPlat; // Nomor plat kendaraan, contoh: "H1234AB"
    private String jenis;  // Jenis kendaraan: "motor" atau "mobil"

    // -------------------- KONSTRUKTOR --------------------

    // Konstruktor 1: tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis  = "";
    }

    // Konstruktor 2: dengan parameter
    // Contoh pemakaian: Kendaraan k = new Kendaraan("H1234AB","motor");
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis  = jenis;
    }

    // -------------------- SELEKTOR (GETTER) --------------------

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // -------------------- MUTATOR (SETTER) --------------------

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

} // end class Kendaraan
