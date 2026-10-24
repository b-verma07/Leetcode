// This for only one missing number is a distinct array 
class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length ;
        for(int i =0; i<=n;i++){
            boolean found =false ;
            for (int j =0 ;j<n ;j++){
                if (nums[j]==i){
                    found =true ;
                    break;
                }
            }
            if (!found){
                return i ;
            }
        }
        return -1;
    }
}

//This for finding every missing number in a aaray
class missing_num {
    public List<Integer> missingNum(int [] arr){  // Function to find the missing number in the array
        int n =arr.length;
        List<Integer> list = new ArrayList<>(); // Creating a list to store the missing numbers
        for (int i =0; i<=n ;i++){
            boolean found =false ;
            for (int j=0; j<n ;j++){
                if (arr[j]==i){
                    found =true;
                    break;
                }
            }
            if (!found) {
                list.add(i); // Adding the missing number to the list , all missing numbers will be added to the list
            }
        }
        return list; // or throw an exception
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
