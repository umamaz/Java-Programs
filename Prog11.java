public class Prog11 {
    
    // Function to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int j = 1; j < n; j++) {   // j starts at 1 (second element)
            int key = arr[j];           // current element to insert
            int i = j - 1;              // last index of sorted part
            
            // Shift elements of arr[0..j-1] that are > key
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];    // shift right
                i = i - 1;              // move left
            }
            
            // Place the key at its correct position
            arr[i + 1] = key;
        }
    }
    
    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Main method
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 4, 6};
        
        System.out.println("Original Array:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
