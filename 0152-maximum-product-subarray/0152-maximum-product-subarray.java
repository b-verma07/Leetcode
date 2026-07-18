//Brute force
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

// Optimal approach 
   int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int answer = nums[0];
      
        for (int i = 1; i < n; i++) {
            int current =nums[i];
            if (current < 0){
                int temp= max;
                max=min;
                min=temp;
            }
            max = Math.max(current ,current * max);
            min = Math.min(current, current * min);
            answer = Math.max(answer,max);
        }
        return answer;

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
