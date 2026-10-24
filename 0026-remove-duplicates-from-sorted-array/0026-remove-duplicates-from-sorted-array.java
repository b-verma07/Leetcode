class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i =1;
        for (int j=1; j< nums.length ;j++){
            if (nums[j]!=nums[i-1]){
                nums[i]= nums[j];
                i++;
            }

        }
        return i;
        }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna