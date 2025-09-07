
import java.util.HashMap;

public class Prog22 {
    public static int[] twoSum(int[] nums, int target) {
        // Use a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement exists, we found the answer
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, store the current number with its index
            map.put(nums[i], i);
        }

        // If no solution found (though problem guarantees one)
        return new int[]{-1, -1};
    }

    // Test program
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
