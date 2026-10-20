class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count =0;
        int max =0;
        for(int i =0; i<n ;i++){
            if(nums[i]==1 ){
                count++;
            }
            else {
                count=0;
            }
              max=Math.max(count,max);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna