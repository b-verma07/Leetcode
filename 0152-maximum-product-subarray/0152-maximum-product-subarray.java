class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
      int max=nums[0];
      for(int  i=0; i<n; i++){
        int pro =1;
        for(int j =i; j<n; j++ ){
            pro *=nums[j];
            max= Math.max(pro,max);
        }

      }
      return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna