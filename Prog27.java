import java.util.Scanner;

public class Prog27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Display the array
        System.out.print("The array elements are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 4: Find maximum and minimum elements
        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // Step 5: Search for an element
        System.out.print("Enter an element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

        // Step 6: Reverse the array
        System.out.print("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

