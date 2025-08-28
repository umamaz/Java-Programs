public class Prog12 {

    
    public static void merge(int arr[], int left, int mid, int right) {
      
        int a1 = mid - left + 1;
        int a2 = right - mid;

       
        int l[] = new int[a1];
        int r[] = new int[a2];

       
        for (int i = 0; i < a1; i++) {
            l[i] = arr[left + i];
        }
        for (int j = 0; j < a2; j++) {
            r[j] = arr[mid + 1 + j];
        }

       

        int i = 0, j = 0;
        int k = left; 

        while (i < a1 && j < a2) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < a1) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < a2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }
    public static void sort(int arr[], int left, int right) {
        if (left < right) {
            //  middle point
            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merging sorted halves
            merge(arr, left, mid, right);
        }
    }

    // function to print array
    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array:");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
