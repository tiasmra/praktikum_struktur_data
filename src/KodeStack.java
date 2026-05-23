import java.util.Stack;

public class KodeStack {
    public static void main (String[] args) {
        Stack<Integer> stackAngka = new Stack<>();
        System.out.println("Proses Push");

        // mulai memasukkan 8 data integer
        int[] dataMasuk = {101, 102, 103, 104, 105, 106, 107, 108};
        for (int data: dataMasuk) {
            stackAngka.push(data);
            System.out.println("Data yang dimasukkan:" + data);
        }

        // kode ini digunakan untuk menampilkan isi stack sebelum pop
        System.out.println("\nIsi Stack sebelum proses pop dilakukan:");
        System.out.println(stackAngka +"<- elemen paling atas pada stack (Top)");

        // kode ini digunakan untuk memulai pop dang menghapus data teratas pada stack
        System.out.println("\nProses Pop");
        int dataDihapus1 = stackAngka.pop();
        System.out.println("Data yang dihapus):" + dataDihapus1);

        int dataDihapus2 = stackAngka.pop();
        System.out.println("Data yang dihapus):" + dataDihapus2);

        // kode ini untuk menampilkan isi stack terbaru setelah proses pop selesai dilakukan
        System.out.println(stackAngka + "<- elemen paling atas pada stack saat ini (Top)");
    }
}
