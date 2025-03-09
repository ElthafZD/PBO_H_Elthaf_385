import java.time.LocalDate; // Mengimpor kelas LocalDate untuk mendapatkan tahun saat ini
import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class elthaf { // Mendefinisikan kelas publik bernama brando

    public static void main(String[] args) { // Metode utama yang dieksekusi saat program dijalankan
        Scanner brando = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.format("Masukkan nama: "); // Menampilkan pesan untuk meminta pengguna memasukkan nama
        String nama = brando.nextLine(); // Membaca input nama dari pengguna dan menyimpannya dalam variabel nama

        System.out.print("Masukkan jenis kelamin (P/L): "); // Menampilkan pesan untuk meminta pengguna memasukkan jenis kelamin
        char jenisKelamin = brando.next().charAt(0); // Membaca input jenis kelamin dari pengguna dan menyimpannya dalam variabel jenisKelamin

        System.out.print("Masukkan tahun lahir: "); // Menampilkan pesan untuk meminta pengguna memasukkan tahun lahir
        int tahunLahir = brando.nextInt(); // Membaca input tahun lahir dari pengguna dan menyimpannya dalam variabel tahunLahir

        int tahunSekarang = LocalDate.now().getYear(); // Mendapatkan tahun saat ini dan menyimpannya dalam variabel tahunSekarang
        int umur = tahunSekarang - tahunLahir; // Menghitung umur berdasarkan tahun lahir dan tahun saat ini

        String jenisKelaminString; // Mendeklarasikan variabel jenisKelaminString untuk menyimpan jenis kelamin dalam bentuk string
        if (jenisKelamin == 'L' || jenisKelamin == 'l') { // Memeriksa apakah jenis kelamin adalah Laki-laki
            jenisKelaminString = "Laki-laki"; // Jika ya, menyimpan "Laki-laki" dalam variabel jenisKelaminString
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') { // Memeriksa apakah jenis kelamin adalah Perempuan
            jenisKelaminString = "Perempuan"; // Jika ya, menyimpan "Perempuan" dalam variabel jenisKelaminString
        } else { // Jika jenis kelamin tidak valid
            jenisKelaminString = "Jenis kelamin tidak valid"; // Menyimpan pesan error dalam variabel jenisKelaminString
        }

        System.out.println("\nData Diri:"); // Menampilkan judul "Data Diri"
        System.out.println("Nama\t\t\t: " + nama); // Menampilkan nama
        System.out.println("Jenis Kelamin\t: " + jenisKelaminString); // Menampilkan jenis kelamin
        System.out.println("Umur\t\t\t: " + umur + " tahun"); // Menampilkan umur

        brando.close(); // Menutup objek Scanner untuk membebaskan sumber daya
    }
}