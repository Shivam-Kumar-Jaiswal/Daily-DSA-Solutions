class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(i==j)
                continue;
                if(nums[i]>nums[j])
                c++;

            }
            arr[i]=c;
        }
        return arr;
    }
}