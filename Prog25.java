import java.util.*;

public class Prog25 {
    public static int findFirstDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return num; // first duplicate found
            } else {
                map.put(num, true);
            }
        }
        return -1; // no duplicates
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 5, 2, 4};
        int result = findFirstDuplicate(arr);

        if (result != -1) {
            System.out.println("First duplicate element: " + result);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
