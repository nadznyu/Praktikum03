import java.util.Scanner;
public class MataKuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah Matakuliah : " );
        dummy = sc.nextLine();
        int jumlahData = Integer.parseInt(dummy);
        System.out.println("----------------------------");

        MataKuliah16 [] arrayOfMataKuliah16 = new MataKuliah16[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMataKuliah16[i] = new MataKuliah16(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah16[i].cetakInfo();

        }
    }
}
