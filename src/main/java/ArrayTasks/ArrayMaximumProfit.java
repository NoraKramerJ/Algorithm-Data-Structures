package ArrayTasks;

public class ArrayMaximumProfit {


    public static void main(String[] args) {
        int[] arr = {20, 33, 3, 1, 4, 9, 12, 11};
        System.out.println(bestProfit(arr));
    }
        private static int bestProfit ( int[] prices) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int each : prices) {
                min = Integer.min(min, each);
                max = Integer.max(max, each - min);
            }
            return max;
        }}

 /*
We are given an array of prices for a given stock. ith  element of this array represents the price of the stock on  day i.
We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.
Write a Java function to find the maximum profit.
    Note that a stock can’t be sold before buying.
    Example:
        Input: [8,3,3,1,4,9,12,11]
        Output: 11

    Explanation: Buy on day 4 (price = 1) and sell on day 7 (price = 12), profit = 12-1 = 11.
    Not 8-1 = 7, as the selling price needs to be larger than buying price.
     */
