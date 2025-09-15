import java.util.HashMap;

public class Prog30 {
    public static void main(String[] args) {
        // Sample data
        String[] keys = {"Apple", "Banana", "Cherry"};

        // Using HashMap (which uses hash functions internally)
        HashMap<String, Integer> map = new HashMap<>();

        // Insert data into HashMap
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], i + 1); // Assign some value
        }

        // Print hash code for each key
        for (String key : keys) {
            int hash = key.hashCode();
            System.out.println("Key: " + key + " | Hash code: " + hash + " | Value: " + map.get(key));
        }
    }
}

