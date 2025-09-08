public class Prog23 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Track minimum price so far
        int maxProfit = 0; // Track maximum profit

        for (int price : prices) {
            // Update minimum price if current price is lower
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate potential profit and update maxProfit if it's higher
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    // Test program
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);  // Output: 5
    }
}

