class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 =new ArrayList<>();
        for(int e:nums){
            if(pivot>e){
                l1.add(e);
            }
            else if(pivot==e){
                l2.add(e);
            }
            else{
                l3.add(e);
            }
        }
        int a = l1.size();
        int b = l2.size();
        int c = l3.size();

        for(int i = 0; i<nums.length; i++){
            if(i<a){
                nums[i] = l1.get(i);
            }
            else if(i<a+b){
                nums[i] = l2.get(i-a);
            }
            else{
                nums[i] = l3.get(i-(a+b));
            }
        }return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna