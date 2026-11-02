class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int count =0;
        int min=nums[0];
        for(int i =1; i<n;i++){
           if(nums[i]<min)
           {
            min =nums[i];
           }
        }
           for(int i=0;i<n;i++){
            count = count +nums[i]-min;
           }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna