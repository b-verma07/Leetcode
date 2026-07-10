class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int temp[] = new int[n];
        int index = 0;
       
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[index] = nums[i];
                index++;
            }
        }
      
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
      
        for( int i=index; i< n; i++){
            nums[i]=0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna