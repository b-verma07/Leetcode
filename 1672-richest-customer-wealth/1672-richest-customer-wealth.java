class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            arr[i] = sum;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna