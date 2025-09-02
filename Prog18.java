import java.util.Random;

public class Prog18 {
    // ---------- INSERTION SORT ----------
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // ---------- MERGE SORT ----------
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {
        Random rand = new Random();

        // Try increasing list sizes
        int[] sizes = {1000, 5000, 10000, 20000, 50000, 100000, 200000, 400000 }; 

        System.out.printf("%-10s %-20s %-20s%n", "Size", "InsertionSort (ms)", "MergeSort (ms)");

        for (int size : sizes) {
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];

            for (int i = 0; i < size; i++) {
                int val = rand.nextInt(800000);
                arr1[i] = val;
                arr2[i] = val;
            }

            // Insertion Sort timing
            long start1 = System.nanoTime();
            insertionSort(arr1);
            long end1 = System.nanoTime();
            double timeInsertion = (end1 - start1) / 1_000_000_000.0; // ms

            // Merge Sort timing
            long start2 = System.nanoTime();
            mergeSort(arr2, 0, arr2.length - 1);
            long end2 = System.nanoTime();
            double timeMerge = (end2 - start2) / 1_000_000_000.0; // ms

            // Print results
            System.out.printf("%-10d %-20.3f %-20.3f%n", size, timeInsertion, timeMerge);
        }
    }
}
