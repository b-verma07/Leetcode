class Solution {
    public int[] runningSum(int[] nums) {
        int n =nums.length;
        int[] ans= new int[n];
        int sum=0;
        for(int i=0; i< n;i++){
           sum =sum+nums[i];
           ans[i]= sum;
        }
        return ans;
    }
}

// Withou a new array 
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
