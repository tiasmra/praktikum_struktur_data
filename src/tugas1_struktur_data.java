import java.util.LinkedList;

public class tugas1_struktur_data {
    public static void main(String[] args) {
        // Soal Nomor 1 Deklarasi Variabel Float
        float StrukturBaris;
        StrukturBaris = 10;
        System.out.println(StrukturBaris);

        // Soal Nomor 2 Deklarasi Variabel String
        String SusunanKataBaru = "Pemrograman Struktur Data Java";
        System.out.println(SusunanKataBaru);

        // Soal Nomor 3 Deklarasi Array 1 Dimensi
        int[] DelapanAngka = { 10, 12, 18, 23, 33, 58, 67, 82 };
        System.out.println(DelapanAngka[5]);

        // Soal Nomor 4 Deklarasi Array 2 Dimensi
        String[][] DuaAngka = {
            { "2", "4", "6" },
            { "8", "10", "12" },
            { "14", "16", "18" }
        };
        System.out.println(DuaAngka[2][2]);

        // Soal Nomor 5 Deklarasi Linked List
        LinkedList<Integer> UrutanListAngka = new LinkedList<>();
        UrutanListAngka.add(15);
        UrutanListAngka.add(28);
        UrutanListAngka.add(33);
        UrutanListAngka.add(47);
        UrutanListAngka.add(59);
        System.out.println(UrutanListAngka);
    }
}