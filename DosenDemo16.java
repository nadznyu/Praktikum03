import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        System.out.print("Masukkan jumlah dosen : ");
        dummy = sc.nextLine();
        int jumlahDosen = Integer.parseInt(dummy);
        System.out.println("---------------------------");

        Dosen16[] arrayOfDosen16 = new Dosen16[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis kelamin (Pria/Wanita) : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------");

            arrayOfDosen16[i] = new Dosen16(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen16 d : arrayOfDosen16) {
            System.out.println("Data Dosen ke-" + no);
            d.cetakInfo();
            no++;

        }
    }
}
