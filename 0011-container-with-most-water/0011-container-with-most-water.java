class Solution {
    public int maxArea(int[] height) {
       int i=0,j=height.length-1,max=0;

       while(i<j){
        max=Math.max((j-i)* Math.min(height[i],height[j]),max);
        if(height[i]<=height[j])
        i++;
        else
        j--;
       }
       return max;
    }    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna