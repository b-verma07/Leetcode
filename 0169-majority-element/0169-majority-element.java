class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                count2++;
            }
        }

        if (count2 > (n / 2)) {
            return el;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna