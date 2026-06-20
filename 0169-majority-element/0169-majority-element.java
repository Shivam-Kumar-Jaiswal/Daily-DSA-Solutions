class Solution {
    public int majorityElement(int[] nums) {
        //1st way
       /* HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        int max = 0,i=-1;
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            int x = e.getValue();
            if(max<x){
                max=x;
                i=e.getKey();
            };
        }
        return i; */
        Arrays.sort(nums);
        int x=nums.length,max = 0,ans=-1;
        for(int i=0;i<x;){
            int j=i+1;
            while(j<x&&nums[j]==nums[i])
            {j++;}
            if((j-i)>max){
                max=(j-i);
                ans=nums[i];
            }
            i=j;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna