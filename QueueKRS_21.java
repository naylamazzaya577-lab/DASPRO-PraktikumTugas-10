public class QueueKRS_21 {
    Mahasiswa_21[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahProses;
public QueueKRS_21(int n) {
        max = n;
        data = new Mahasiswa_21[max];
        size = 0;
        front = rear = -1;
        sudahProses = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }
    public void enqueue(Mahasiswa_21 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa berhasil masuk antrian");
        }
    }
    public void dequeueProsesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa!");
            return;
        }
        System.out.println("Mahasiswa dipanggil untuk proses KRS:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa_21 mhs = data[front];
            mhs.tampilData();

            front = (front + 1) % max;
            size--;
            sudahProses++;
        }
        if (size == 0) {
            front = rear = -1;
        }
    }
    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Daftar Antrian:");
            int i = front;
            while (i != rear) {
                data[i].tampilData();
                i = (i + 1) % max;
            }
            data[i].tampilData();
        }
    }
    public void tampilDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("2 Antrian Terdepan:");

            int i = front;
            for (int j = 0; j < 2 && j < size; j++) {
                data[i].tampilData();
                i = (i + 1) % max;
            }}}
    public void tampilBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilData();
        }
    }
    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini : " + size);
    }
    public void jumlahSudahProses() {
        System.out.println("Jumlah mahasiswa sudah proses KRS : " + sudahProses);
    }
    public void jumlahBelumProses() {
        int belum = 30 - sudahProses;
        System.out.println("Jumlah mahasiswa belum proses KRS : " + belum);
    }}