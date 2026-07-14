class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int profit =0;
        int min = prices[0];
        for (int num:prices){
            int diff= num-min;
            profit= Math.max(profit,diff);
            min= Math.min(min,num);
        }
    return profit;
    }
}

//  with normal for loop 
class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        for (int i=0 ;i<n ; i++) {
            int diff = prices[i] - min;
            profit = Math.max(profit, diff);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}
// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
