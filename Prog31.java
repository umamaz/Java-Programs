public class Prog31 {
    public static void main(String[] args) {
        String str = "Umama";

        System.out.println("All possible substrings of \"" + str + "\":");

        int n = str.length();

        // Outer loop for start index
        for (int i = 0; i < n; i++) {
            // Inner loop for end index
            for (int j = i + 1; j <= n; j++) {
                // substring(i, j) gives substring from i to j-1
                System.out.println(str.substring(i, j));
            }
        }
    }
}

