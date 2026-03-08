// ============================================================
// CLASS DOSEN
// Class ini menyimpan data seorang dosen.
// ============================================================

public class Dosen {

    // -------------------- ATRIBUT --------------------
    // Atribut adalah "data" yang dimiliki oleh setiap objek Dosen

    private String nip;    // Nomor Induk Pegawai dosen
    private String nama;   // Nama dosen
    private String prodi;  // Program studi dosen

    // -------------------- KONSTRUKTOR --------------------
    // Konstruktor adalah method khusus yang dipanggil saat membuat objek baru.

    // Konstruktor 1: tanpa parameter
    // Digunakan saat kita belum tahu datanya, contoh: Dosen d = new Dosen();
    public Dosen() {
        this.nip   = "";
        this.nama  = "";
        this.prodi = "";
    }

    // Konstruktor 2: dengan parameter
    // Digunakan saat kita langsung memasukkan data, contoh: Dosen d = new Dosen("123","Andi","Informatika");
    public Dosen(String nip, String nama, String prodi) {
        this.nip   = nip;
        this.nama  = nama;
        this.prodi = prodi;
    }

    // -------------------- SELEKTOR (GETTER) --------------------
    // Getter = method untuk MENGAMBIL / MEMBACA nilai atribut

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    // -------------------- MUTATOR (SETTER) --------------------
    // Setter = method untuk MENGUBAH / MENGISI nilai atribut

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

} // end class Dosen
