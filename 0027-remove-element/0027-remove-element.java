class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i=0;
        while (i < n ){
            if (nums[i]== val){
                nums[i]= nums[n-1];
                n--;
            }
            else {
                i++;
            }
        }
        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna