// Kadane algorithm 
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];

            int isum = nums[0];
        for (int i = 1; i < n; i++) {
            isum = Math.max(nums[i], isum + nums[i]);
            sum = Math.max(sum, isum);
        }
        return sum;
    }
}

// Brute force 
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int result = nums[0];

        for (int i = 0; i < n; i++) {
            int current_sum = 0;
            for (int j = i; j < n; j++) {
                current_sum += nums[j];
                result = Math.max(result, current_sum);
            }
        }
        return result;
    }
}
// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
