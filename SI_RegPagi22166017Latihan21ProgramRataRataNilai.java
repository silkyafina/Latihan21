import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan rata-rata nilai yang inputannya berasal dari user
 */
public class SI_RegPagi22166017Latihan21ProgramRataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      // Deklarasi variabel
        int jml_nilai = 0;
        int banyak_mhs;
        double rata_rata;
    
        
      // Input banyak mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        banyak_mhs = input.nextInt();
        
      // Input nilai 
        for (int nilai_ke = 1; nilai_ke <= banyak_mhs; nilai_ke++) {
            System.out.print("Nilai Mahasiswa ke-" + nilai_ke + ": ");
            int nilai = input.nextInt();
            jml_nilai += nilai;
        }
        
        // Menghitung rata-rata
        rata_rata = (double) jml_nilai / banyak_mhs;
        
        // Rata-rata nilai
        System.out.println("Maka, Rata-rata nilainya adalah " + rata_rata);
   
        System.out.println("(Developed by: Silky Afina Saly)");
    } 
}
