class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length ;
        for(int i=0;i<=n-1;i++){
            if(nums[i]!=i+1){
                if(nums[nums[i]-1]!=nums[i]){
                    int x=nums[nums[i]-1];
                    nums[nums[i]-1]=nums[i];
                    nums[i]=x;
                    i--;
                }
            }
        }
        List<Integer> l=new ArrayList<>();
         for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                l.add(i+1);
            }
        }
        return l;
    }
}