class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = Integer.MIN_VALUE;
        int isum =  0;
        for ( int i = 0 ; i< n ; i++){
            isum = Math.max(nums[i], isum+nums[i] );
            sum =Math.max(sum , isum);
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna