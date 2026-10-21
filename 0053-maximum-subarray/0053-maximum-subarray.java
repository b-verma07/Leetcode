class Solution {
    public int maxSubArray(int[] nums) {
       int n=nums.length;
       int sum =nums[0];
       int secSum=nums[0];
       for (int i=1;i<n ;i++){
        secSum=Math.max(nums[i], nums[i]+ secSum);
        sum =Math.max(sum, secSum);
       } 
       return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna