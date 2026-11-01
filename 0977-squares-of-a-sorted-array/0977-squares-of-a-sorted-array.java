//Brute force
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0; i< n;i++){
            temp[i]= nums[i]*nums[i];
        }
        for (int i=0; i<n;i++){
    nums[i]=temp[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

//optimal two pointer approach 
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                arr[index] = l;
                // index--;
                left++;
            } else {
                arr[index] = r;
                right--;
            }
            index--;

        }
        return arr;
    }
}
// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
