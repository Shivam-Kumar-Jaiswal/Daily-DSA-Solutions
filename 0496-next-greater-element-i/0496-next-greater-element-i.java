class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> h = new HashMap<>();
       int l1=nums1.length;int l2 = nums2.length;
       int[] nums3 = new int[l2];
       for(int i=0;i<l2;i++) {
        h.put(nums2[i],i);
       }
       Stack<Integer> stack = new Stack<>();
       for(int i=0;i<l2;i++){
            while(!stack.isEmpty()&&nums2[stack.peek()]<nums2[i]){
                nums3[stack.pop()]=nums2[i];
            }
            stack.push(i);
       }while(!stack.isEmpty()){
        nums3[stack.pop()]=-1;
       }
       for(int i=0;i<l1;i++){
        nums1[i]=nums3[h.get(nums1[i])];
       }
       return nums1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna