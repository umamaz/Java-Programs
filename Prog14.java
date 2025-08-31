public class Prog14 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 5, 12, 62, 19, 90}; 
        
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Bubble sort 
    public static void bubbleSort(int[] arr) {
    int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; 
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    //Method for printing array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
