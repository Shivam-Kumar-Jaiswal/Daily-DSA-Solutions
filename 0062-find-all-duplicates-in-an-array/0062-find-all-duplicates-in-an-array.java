class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i= 0;i<nums.length;i++){
            if(arr[nums[i]-1]==1){
                l.add(nums[i]);
            }
            else{
                arr[nums[i]-1]=1;
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna