// Optimal appraoch(XOR)
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            count = count ^ nums[i];

        }
            return count;
    }
  
}

// Brute force 
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int count = 0;
        
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
                if (count == 1)
                    return nums[i] ;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
