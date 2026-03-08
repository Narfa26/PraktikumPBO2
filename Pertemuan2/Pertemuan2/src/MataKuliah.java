// ============================================================
// CLASS MATAKULIAH
// Class ini menyimpan data sebuah mata kuliah.
// ============================================================

public class MataKuliah {

    // -------------------- ATRIBUT --------------------

    private String idMatKul; // Kode/ID mata kuliah, contoh: "PBO"
    private String nama;     // Nama mata kuliah, contoh: "Pemrograman Berorientasi Objek"
    private int sks;         // Jumlah SKS mata kuliah, contoh: 3

    // -------------------- KONSTRUKTOR --------------------

    // Konstruktor 1: tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama     = "";
        this.sks      = 0;
    }

    // Konstruktor 2: dengan parameter
    // Contoh pemakaian: MataKuliah mk = new MataKuliah("PBO","Pemrograman Berorientasi Objek",3);
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama     = nama;
        this.sks      = sks;
    }

    // -------------------- SELEKTOR (GETTER) --------------------

    public String getIdMatKul() {
        return idMatKul;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    // -------------------- MUTATOR (SETTER) --------------------

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

} // end class MataKuliah
