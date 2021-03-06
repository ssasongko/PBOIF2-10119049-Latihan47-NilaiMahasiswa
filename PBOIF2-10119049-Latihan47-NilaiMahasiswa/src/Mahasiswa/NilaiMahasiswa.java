package Mahasiswa;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Nilai Mahasiswa
*/

public class NilaiMahasiswa {
    private float quiz;
    private float uts;
    private float uas;
    private float nilaiAkhir;
    private char index;
    private String keterangan;
           
    
    public NilaiMahasiswa(float quiz, float uts, float uas){
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }
    
    public float getNilaiQuiz(){
        return quiz;
    }
    
    public float getNilaiUTS(){
        return uts;
    }
    
    public float getNilaiUAS(){
        return uas;
    }
    
    public void setNilaiAkhir(float quiz, float uts, float uas){
        this.nilaiAkhir = (float)((0.2 * quiz) + (0.3 * uts) + (0.5 * uas));
    }
    
    public float getNilaiAkhir(){
        return nilaiAkhir;
    }
    
    public void setIndex(float nilaiAkhir){
        if((nilaiAkhir >= 80) && (nilaiAkhir <= 100)){
            this.index = 'A';
        }
        else if((nilaiAkhir >= 68) && (nilaiAkhir < 80)){
            this.index = 'B';
        }
        else if((nilaiAkhir >= 56) && (nilaiAkhir < 68)){
            this.index = 'C';
        }
        else if((nilaiAkhir >= 45) && (nilaiAkhir < 56)){
            this.index = 'D';
        }
        else{
            this.index = 'E';
        }
    }
    public char getIndex(){
        return index;
    }
    
    public void setKeterangan(char index){
        switch(index){
            case 'A' : 
                this.keterangan = "Sangat Baik";
                break;
            case 'B' : 
                this.keterangan = "Baik";
                break;
            case 'C' : 
                this.keterangan = "Cukup";
                break;
            case 'D' : 
                this.keterangan = "Kurang";
                break;
            default :
                this.keterangan = "Sangat Kurang";               
        }
    }
    
    public String getKeterangan(){
        return keterangan;
    }
}
