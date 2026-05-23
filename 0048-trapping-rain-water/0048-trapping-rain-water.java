class Solution {
    public int trap(int[] height) {
        int m=height.length,ans=0;
        int[] leftMax =new int[m];
        int[] rightMax = new int[m];
        leftMax[0]=height[0];
        rightMax[m-1]=height[m-1];
        for(int i=1;i<m;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        for(int i=m-2;i>0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        for(int i = 1;i<m;i++){
           int x=Math.min(leftMax[i],rightMax[i])-height[i];
           if(x>0)
           ans+=x; 
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna