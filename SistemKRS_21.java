import java.util.Scanner;

public class SistemKRS_21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS_21 antrian = new QueueKRS_21(10);

        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Jumlah Antrian");
            System.out.println("10. Jumlah Sudah Proses KRS");
            System.out.println("11. Jumlah Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa_21 mhs = new Mahasiswa_21(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeueProsesKRS();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampilDepan();
                    break;

                case 5:
                    antrian.tampilBelakang();
                    break;

                case 6:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;

                case 7:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian belum penuh");
                    }
                    break;
                case 8:
                    antrian.clear();
                    break;

                case 9:
                    antrian.jumlahAntrian();
                    break;

                case 10:
                    antrian.jumlahSudahProses();
                    break;

                case 11:
                    antrian.jumlahBelumProses();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);

        sc.close();
    }
}