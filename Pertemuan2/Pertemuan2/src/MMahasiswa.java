// ============================================================
// CLASS MMAHASISWA - INI ADALAH MAIN CLASS (PROGRAM UTAMA)
// Di sinilah program mulai berjalan ketika dijalankan.
// Kita akan membuat objek-objek dan menghubungkannya.
// ============================================================

public class MMahasiswa {

    public static void main(String[] args) {

        // ====================================================
        // LANGKAH 1: Buat objek-objek MataKuliah
        // Format: MataKuliah namaVariabel = new MataKuliah(idMatKul, nama, sks);
        // ====================================================

        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ALG = new MataKuliah("ALG", "Algoritma dan Pemrograman", 4);

        // ====================================================
        // LANGKAH 2: Buat objek-objek Dosen
        // Format: Dosen namaVariabel = new Dosen(nip, nama, prodi);
        // ====================================================

        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Dosen D2 = new Dosen("456", "Budi", "Sistem Informasi");

        // ====================================================
        // LANGKAH 3: Buat objek-objek Kendaraan
        // Format: Kendaraan namaVariabel = new Kendaraan(noPlat, jenis);
        // ====================================================

        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        Kendaraan K2 = new Kendaraan("B5678CD", "mobil");

        // ====================================================
        // LANGKAH 4: Buat objek-objek Mahasiswa
        // Format: Mahasiswa namaVariabel = new Mahasiswa(nim, nama, prodi);
        // ====================================================

        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Mahasiswa M2 = new Mahasiswa("235", "Dinda", "Sistem Informasi");
        Mahasiswa M3 = new Mahasiswa("236", "Eko", "Informatika");

        // ====================================================
        // LANGKAH 5: Hubungkan (relasikan) objek-objek
        // ====================================================

        // --- Mahasiswa M1 (Citra) ---
        M1.setDosenWali(D1);        // Citra punya dosen wali: Andi
        M1.setKendaraan(K1);        // Citra punya kendaraan: motor H1234AB
        M1.addMatKul(PBO);          // Citra ambil mata kuliah PBO
        M1.addMatKul(MBD);          // Citra ambil mata kuliah MBD

        // --- Mahasiswa M2 (Dinda) ---
        M2.setDosenWali(D2);        // Dinda punya dosen wali: Budi
        M2.setKendaraan(K2);        // Dinda punya kendaraan: mobil B5678CD
        M2.addMatKul(PBO);          // Dinda ambil mata kuliah PBO
        M2.addMatKul(ALG);          // Dinda ambil mata kuliah ALG

        // --- Mahasiswa M3 (Eko) ---
        M3.setDosenWali(D1);        // Eko punya dosen wali: Andi (boleh sama)
        // M3 tidak punya kendaraan (null = tidak punya)
        M3.addMatKul(MBD);          // Eko ambil mata kuliah MBD
        M3.addMatKul(PBO);          // Eko ambil mata kuliah PBO
        M3.addMatKul(ALG);          // Eko ambil mata kuliah ALG

        // ====================================================
        // LANGKAH 6: Tampilkan informasi setiap mahasiswa
        // ====================================================

        // Tampilkan detail lengkap M1
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
        System.out.println();

        // Tampilkan detail lengkap M2
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
        System.out.println();

        // Tampilkan detail lengkap M3
        M3.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M3.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M3.getJumlahSKS());
        System.out.println();

    } // end main

} // end class MMahasiswa
