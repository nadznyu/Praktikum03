public class DataDosen16 {
    public void dataSemuaDosen(Dosen16[] arrayOfDosen16) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        int no = 1;
        for (Dosen16 d : arrayOfDosen16) {
            System.out.println("Data Dosen ke-" + no);
            d.cetakInfo();
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen16[] arrayOfDosen16) {
        int pria = 0, wanita = 0;
        for (Dosen16 d : arrayOfDosen16) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println("--------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrayOfDosen16) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen16 d : arrayOfDosen16) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += d.usia;
                jumlahWanita++;
            }
        }

        System.out.println("=== RATA-RATA USIA PER JENIS KELAMIN ===");
        if (jumlahPria > 0) {
            System.out.println("Rata-rata usia pria    : " + (double) totalUsiaPria/jumlahPria);
        } else {
            System.out.println("Rata-rata usia pria : data tidak tersedia");
        }
        if (jumlahWanita > 0) {
            System.out.println("Rata-rata usia wanita  : " + (double) totalUsiaWanita/jumlahWanita);
        } else {
            System.out.println("Rata-rata usia wanita : data tidak tersedia");
        }
        System.out.println("----------------------------------------");
    }

    public void infoDosenPalingTua(Dosen16[] arrayOfDosen16) {
        Dosen16 palingTua = arrayOfDosen16[0];
        for (Dosen16 d : arrayOfDosen16) {
            if (d.usia > palingTua.usia) {
                palingTua = d;
            }
        }
        System.out.println("=== DOSEN PALING TUA ===");
        palingTua.cetakInfo();
    }

    public void infoDosenPalingMuda(Dosen16[] arrayOfDosen16) {
        Dosen16 palingMuda = arrayOfDosen16[0];
        for (Dosen16 d : arrayOfDosen16) {
            if (d.usia < palingMuda.usia) {
                palingMuda = d;
            }
        }
        System.out.println("=== DOSEN PALING MUDA ===");
        palingMuda.cetakInfo();
    }
}
