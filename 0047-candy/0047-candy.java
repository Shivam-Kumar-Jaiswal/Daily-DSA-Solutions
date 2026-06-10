class Solution {
    public int candy(int[] ratings) {
        int x = ratings.length;
        int sum;
        int[] arr1 = new int[x];
        Arrays.fill(arr1,1);
        
        for(int i=1;i<x;i++){
            if(ratings[i]>ratings[i-1])
            arr1[i]=arr1[i-1]+1;
        }

      
        for(int i=x-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]&&arr1[i]<=arr1[i+1])
            arr1[i]=arr1[i+1]+1;
        }
        
        sum = 0;
    for(int i=0;i<x;i++){
        sum+=arr1[i];
    }
    return sum;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna