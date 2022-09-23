package leetcode.medium.arrays;

// Topic: Array, Dynamic Programming, Greedy

public class BuySellStock2 {

    // time: O(N) | space: O(1)
    static int maxProfit(int[] prices) {
      if (prices == null || prices.length == 0)  return 0;
      int maxProfit = 0;

      for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) maxProfit += prices[i] - prices[i - 1];
      }
      return maxProfit;
    };

    public static void main(String[] args) {
        int[] prices = { 7,1,5,3,6,4 };
        System.out.println(maxProfit(prices));
    }
}
