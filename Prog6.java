public class Prog6 {
    public static boolean isPalindrome(int x) {
       
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;
        
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + (x % 10);
            x /= 10;
        }
        
        return x == reversedHalf || x == reversedHalf / 10;
    }

    // quick test
    public static void main(String[] args) {
        int[] tests = {0, 5, 11, 121, 12321, 122, 10, -121, 2147447412};
        for (int n : tests) {
            System.out.printf("%d -> %b%n", n, isPalindrome(n));
        }
    }
}

