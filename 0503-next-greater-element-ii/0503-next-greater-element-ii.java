class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int l=nums.length;
        int[] nums2 = new int[l];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<l;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
                nums2[stack.pop()]=nums[i];
            }
            stack.push(i);
       }
       int i=0;
       while(i<stack.peek()){
        while(!stack.isEmpty()&&i<stack.peek()&&nums[stack.peek()]<nums[i]){
        nums2[stack.pop()]=nums[i];
       }i++;
    }
    while(!stack.isEmpty())
    nums2[stack.pop()]=-1;
    return nums2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna