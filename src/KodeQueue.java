import java.util.LinkedList;
import java.util.Queue;

public class KodeQueue {
    public static void main (String[] args) {
        // menggunakan linkedlist untuk inisialisasi queue
        Queue<Integer> antrianAngka = new LinkedList<>();

        // mulai memasukkan 8 data integer
        System.out.println("Proses Enqueue atau Masuk Antrian");
        int[] dataMasuk = {101, 102, 103, 104, 105, 106, 107, 108};
        for (int data: dataMasuk) {
            antrianAngka.add(data);
            System.out.println("Data ditambahkan ke dalam antrian:" + data);
        }

        // kode ini untuk menampilkan isi queue sebelum dequeue
        System.out.println("\nIsi Queue sebelum melakukan Dequeue:");
        System.out.println("Bagian Depan (Head) ->" + antrianAngka +"<- Bagian belakang (Tail)");

        // kode ini untuk memulai proses dequeue atau penghapusan elemen
        System.out.println("\nProses Dequeue mulai dilakukan");
        int dataKeluar1 = antrianAngka.remove();
        System.out.println("Data keluar dari antrian:" + dataKeluar1);

        int dataKeluar2 = antrianAngka.remove();
        System.out.println("Data keluar dari antrian:" + dataKeluar2);

        // kode ini untuk menampilkan isi queue setelah proses dequeue selesai dilakukan
        System.out.println("\nIsi Queue setelah proses Dequeue selesai dilakukan:");
        System.out.println("Bagian Depan (Head) ->" + antrianAngka +"<- Bagian belakang (Tail)");
    }
}
