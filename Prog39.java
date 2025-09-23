
    import java.util.Arrays;
import java.util.Scanner;

public class Prog39 {

    // Display array
    static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Linear search
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // Reverse array
    static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Sort array
    static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    // Insert element at position
    static int[] insertElement(int[] arr, int element, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) newArr[i] = element;
            else newArr[i] = arr[j++];
        }
        return newArr;
    }

    // Delete element at position
    static int[] deleteElement(int[] arr, int pos) {
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != pos) newArr[j++] = arr[i];
        }
        return newArr;
    }

    // Count occurrences
    static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int num : arr) if (num == key) count++;
        return count;
    }

    // String operations
    static void stringOperations(String str) {
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Reverse: " + new StringBuilder(str).reverse().toString());
        System.out.println("Substring (0,3): " + str.substring(0, Math.min(3, str.length())));
        System.out.println("Contains 'a': " + str.contains("a"));
        System.out.println("Replace 'a' with '*': " + str.replace('a', '*'));
        System.out.println("Split by ' ': " + Arrays.toString(str.split(" ")));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array operations
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Original Array:");
        displayArray(arr);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        System.out.println(key + " found at index: " + index);

        reverseArray(arr);
        System.out.println("Reversed Array:");
        displayArray(arr);

        sortArray(arr);
        System.out.println("Sorted Array:");
        displayArray(arr);

        System.out.print("Enter element to insert: ");
        int elem = sc.nextInt();
        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();
        arr = insertElement(arr, elem, pos);
        System.out.println("Array after insertion:");
        displayArray(arr);

        System.out.print("Enter position to delete: ");
        int delPos = sc.nextInt();
        arr = deleteElement(arr, delPos);
        System.out.println("Array after deletion:");
        displayArray(arr);

        System.out.print("Enter element to count occurrences: ");
        int countKey = sc.nextInt();
        System.out.println("Occurrences of " + countKey + ": " + countOccurrences(arr, countKey));

        // String operations
        sc.nextLine(); // consume newline
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        stringOperations(str);

        sc.close();
    }
}

    

