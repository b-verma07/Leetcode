//Optimal approach
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


//Brute force & time limit exceed
class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {

                sum += nums[j];
                maxi = Math.max(sum, maxi);
            }
        }
        return maxi;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
