import java.util.Random;

public class Prog40 {
    static int recursiveCallsStandard = 0;
    static int recursiveCallsThreeWay = 0;
    static Random rand = new Random();

    // RANDOMIZED_QUICKSORT
    public static void randomizedQuicksort(int[] A, int p, int r) {
        if (p < r) {
            recursiveCallsStandard++;

            // Random pivot
            int pivotIndex = rand.nextInt(r - p + 1) + p;
            int pivot = A[pivotIndex];
            // Move pivot to end
            int temp = A[pivotIndex];
             A[pivotIndex] = A[r];
              A[r] = temp;

            // Partition inline
            int i = p - 1;
            for (int k = p; k < r; k++) {
                if (A[k] <= pivot) {
                    i++;
                    temp = A[i]; A[i] = A[k]; A[k] = temp;
                }
            }
            // Place pivot in final position
            temp = A[i + 1];
             A[i + 1] = A[r];
              A[r] = temp;
            int q = i + 1;

            // Recurse
            randomizedQuicksort(A, p, q - 1);
            randomizedQuicksort(A, q + 1, r);
        }
    }

    // RANDOMIZED_QUICKSORT'
    public static void randomizedQuicksort_(int[] A, int p, int r) {
        if (p < r) {
            recursiveCallsThreeWay++;

            // Random pivot
            int pivotIndex = rand.nextInt(r - p + 1) + p;
            int pivot = A[pivotIndex];
            // Move pivot to end
            int temp = A[pivotIndex];
             A[pivotIndex] = A[r]; 
             A[r] = temp;

            // Three-way partition inline
            int q = p, k = p, t = r;
            while (k <= t) {
                if (A[k] < pivot) {
                    temp = A[k];
                     A[k] = A[q];
                      A[q] = temp;
                    q++; k++;
                } else if (A[k] > pivot) {
                    temp = A[k];
                     A[k] = A[t];
                      A[t] = temp;
                    t--;
                } else { // A[k] == pivot
                    k++;
                }
            }

            // Recursing only on < pivot and > pivot
            randomizedQuicksort_(A, p, q - 1);
            randomizedQuicksort_(A, t + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 10, 11, 13, 8, 8, 3, 5, 2, 11, 8};
        int[] arrRandomized = arr.clone();
        int[] arrThreeWay = arr.clone();

        randomizedQuicksort(arrRandomized, 0,arrRandomized.length - 1);
        randomizedQuicksort_(arrThreeWay, 0, arrThreeWay.length - 1);

        System.out.println("Number of recursive calls for RANDOMIZED-QUICKSORT : " + recursiveCallsStandard);
        System.out.println("Number of recursive calls for RANDOMIZED-QUICKSORT' : " + recursiveCallsThreeWay);

      
    }
}
