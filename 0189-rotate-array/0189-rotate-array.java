class Solution {
    public void rotate(int[] nums, int k) {
        // Syncc
        int n = nums.length;
        int[] temp = new int[n];
        k=k%n;
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        for (int i = k; i < n; i++) {
            temp[i] = nums[i - k];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna