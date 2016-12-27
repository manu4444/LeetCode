package edu.umn.cse.manu;

/**
 * Created by maste on 12/26/2016.
 * <p>
 * This could be done in O(n) time in single traversal
 */
public class Best_Time_to_Buy_and_Sell_Stock_121 {

    public static int maxProfit(int[] prices) {
        int max = 0;

        //Brute Force
        /*for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                max = (max < prices[j]-prices[i]) ? prices[j]-prices[i] : max;
            }
        }*/

        int diff = 0;

        if (prices.length > 0) {
            int start = prices[0];

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > start) {
                    if (diff < prices[i] - start) {
                        diff = prices[i] - start;
                    }
                } else {
                    start = prices[i];
                }
            }
        }

        return diff;
    }

    public static void main(String[] args) {
        int[] input = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(input));
    }
}
