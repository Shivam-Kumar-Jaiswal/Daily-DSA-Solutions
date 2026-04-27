class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] vis = new boolean[nums.length+1];
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(vis[nums[i]])
            arr[0]=nums[i];
            vis[nums[i]]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!vis[i])
            arr[1]=i;
        }
        return arr;
    }
}