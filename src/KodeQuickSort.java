import java.util.Arrays;

public class KodeQuickSort {
    // kode ini untuk mengurutkan array menggunakn algoritma Quick Sort secara rekursif
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // kode ini untuk membagi array berdasarkan pivot dan mengembalikan posisi pivot
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // kode ini untuk menmpilkan isi array
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // kode ini merupakan fungsi utama untuk menjalankan program Quick Sort
    public static void main(String[] args) {
        int[] arr = {105, 107, 102, 104, 108, 106, 101, 103};
        System.out.println("Array aslinya:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array yang diurutkan:");
        printArray(arr);
    }
}
