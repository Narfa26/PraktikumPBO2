// ============================================================
// CLASS MAHASISWA
// Class ini adalah class utama yang berelasi dengan class lain:
//   - ASOSIASI  dengan MataKuliah (mahasiswa ambil banyak matkul)
//   - ASOSIASI  dengan Dosen      (mahasiswa punya 1 dosen wali)
//   - KOMPOSISI dengan Kendaraan  (mahasiswa punya 0 atau 1 kendaraan)
// ============================================================

import java.util.ArrayList; // Kita pakai ArrayList agar lebih fleksibel dari array biasa

public class Mahasiswa {

    // -------------------- ATRIBUT --------------------

    private String nim;    // Nomor Induk Mahasiswa
    private String nama;   // Nama mahasiswa
    private String prodi;  // Program studi mahasiswa

    // ArrayList untuk menyimpan daftar mata kuliah yang diambil (maks 50)
    // ArrayList<MataKuliah> artinya: list yang isinya objek-objek MataKuliah
    private ArrayList<MataKuliah> listMatKul;

    // Dosen wali mahasiswa (relasi: 1 mahasiswa punya tepat 1 dosen wali)
    private Dosen dosenWali;

    // Kendaraan mahasiswa (relasi: 1 mahasiswa punya 0 atau 1 kendaraan)
    private Kendaraan kendaraan;

    // -------------------- KONSTRUKTOR --------------------

    // Konstruktor 1: tanpa parameter
    public Mahasiswa() {
        this.nim        = "";
        this.nama       = "";
        this.prodi      = "";
        this.listMatKul = new ArrayList<>(); // Inisialisasi list kosong
        this.dosenWali  = null;              // Belum ada dosen wali
        this.kendaraan  = null;              // Belum punya kendaraan
    }

    // Konstruktor 2: dengan parameter nim, nama, prodi
    // Contoh: Mahasiswa m = new Mahasiswa("234","Citra","Informatika");
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim        = nim;
        this.nama       = nama;
        this.prodi      = prodi;
        this.listMatKul = new ArrayList<>(); // List tetap diinisialisasi kosong
        this.dosenWali  = null;
        this.kendaraan  = null;
    }

    // -------------------- SELEKTOR (GETTER) --------------------

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // -------------------- MUTATOR (SETTER) --------------------

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // -------------------- METHOD TAMBAHAN --------------------

    // Method untuk MENAMBAHKAN mata kuliah ke dalam list
    // Maksimal 50 mata kuliah sesuai aturan relasi
    public void addMatKul(MataKuliah newMatKul) {
        if (listMatKul.size() < 50) {
            listMatKul.add(newMatKul);
        } else {
            System.out.println("Sudah mencapai batas maksimal 50 mata kuliah!");
        }
    }

    // Method untuk menghitung TOTAL SKS dari semua mata kuliah yang diambil
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            totalSKS = totalSKS + listMatKul.get(i).getSks();
        }
        return totalSKS;
    }

    // Method untuk menghitung JUMLAH mata kuliah yang diambil
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    // Method untuk menampilkan data dasar mahasiswa (nim, nama, prodi)
    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // Method untuk menampilkan SEMUA detail mahasiswa beserta relasi-relasinya
    public void printDetailMhs() {
        System.out.println("========================================");
        System.out.println("          DATA MAHASISWA");
        System.out.println("========================================");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);

        // Tampilkan daftar mata kuliah
        System.out.println("----------------------------------------");
        System.out.println("Mata Kuliah yang Diambil:");
        if (listMatKul.size() == 0) {
            System.out.println("  (Belum mengambil mata kuliah)");
        } else {
            for (int i = 0; i < listMatKul.size(); i++) {
                MataKuliah mk = listMatKul.get(i);
                System.out.println("  " + (i+1) + ". [" + mk.getIdMatKul() + "] " + mk.getNama() + " - " + mk.getSks() + " SKS");
            }
        }

        // Tampilkan data dosen wali
        System.out.println("----------------------------------------");
        System.out.println("Dosen Wali:");
        if (dosenWali == null) {
            System.out.println("  (Belum memiliki dosen wali)");
        } else {
            System.out.println("  NIP   : " + dosenWali.getNip());
            System.out.println("  Nama  : " + dosenWali.getNama());
            System.out.println("  Prodi : " + dosenWali.getProdi());
        }

        // Tampilkan data kendaraan
        System.out.println("----------------------------------------");
        System.out.println("Kendaraan:");
        if (kendaraan == null) {
            System.out.println("  (Tidak memiliki kendaraan)");
        } else {
            System.out.println("  No. Plat : " + kendaraan.getNoPlat());
            System.out.println("  Jenis    : " + kendaraan.getJenis());
        }
        System.out.println("========================================");
    }

} // end class Mahasiswa
