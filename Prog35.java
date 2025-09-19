import java.util.HashMap;
import java.util.Map;

public class Prog35 {
    // Function to find indices of two numbers that add up to target
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // store value -> index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what we need to find
            
            // Check if complement already exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // return indices
            }
            
            // Otherwise, store this number with its index
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
