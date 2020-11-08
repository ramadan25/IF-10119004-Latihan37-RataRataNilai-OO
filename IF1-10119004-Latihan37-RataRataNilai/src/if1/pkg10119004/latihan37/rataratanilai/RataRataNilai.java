/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan37.rataratanilai;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan rata-rata nilai
 * 
 */
class RataRataNilai {
    private static Scanner scanner = new Scanner(System.in);
    private static int i, jumlahMahasiswa;      
    private static float jumlah, nilaiMahasiswa, rataRataNilai;
    
    private static int inputJumlahMhs() {
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
        return jumlahMahasiswa;
    }
    
    public static double hitungRataRataNilai() {
        inputJumlahMhs();
        jumlah = 0;
        i=1;
        while (i <= jumlahMahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilaiMahasiswa = scanner.nextFloat ();
                jumlah += nilaiMahasiswa;
                i++;
        }
        rataRataNilai = jumlah / jumlahMahasiswa;
        return rataRataNilai;
    }
    
}
