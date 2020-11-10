package pboif2.pkg10119049.latihan47.nilaimahasiswa;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Nilai Mahasiswa 
*/

import Mahasiswa.NilaiMahasiswa; // import from tabungan
public class PBOIF210119049Latihan47NilaiMahasiswa {
    public static void main(String[] args) {
        NilaiMahasiswa mahasiswa = new NilaiMahasiswa(75, 45, 34);
        
        System.out.printf("QUIZ       : %.1f\n",mahasiswa.getNilaiQuiz());
        System.out.printf("UTS        : %.1f\n",mahasiswa.getNilaiUTS());
        System.out.printf("UAS        : %.1f\n\n",mahasiswa.getNilaiUAS());
        
        mahasiswa.setNilaiAkhir(mahasiswa.getNilaiQuiz(),mahasiswa.getNilaiUTS(),mahasiswa.getNilaiUAS());
        System.out.printf("Nilai Akhir   : %.1f\n\n",mahasiswa.getNilaiAkhir());
        
        mahasiswa.setIndex(mahasiswa.getNilaiAkhir());
        System.out.printf("Index   : %s\n",mahasiswa.getIndex());
        
        mahasiswa.setKeterangan(mahasiswa.getIndex());
        System.out.printf("Keterangan   : %s\n",mahasiswa.getKeterangan());
        
    }
    
}
