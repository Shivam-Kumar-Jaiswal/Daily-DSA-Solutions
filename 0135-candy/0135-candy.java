class Solution {
    public int candy(int[] ratings) {
        int x = ratings.length;
        int[] arr = new int[x];
        Arrays.fill(arr,1);
        int change =0;int sum = 0;
        do{
             change = 0;
            for(int i=0;i<x-1;i++){
             if(ratings[i+1]<ratings[i]&&arr[i]<=arr[i+1]){
                arr[i]+=1;
                change = 1;
                }
            }
            for(int i=x-1;i>0;i--){
                if(ratings[i-1]<ratings[i]&&arr[i-1]>=arr[i])
                {arr[i]+=1;
                change = 1;}
            }
             sum=0;
            for(int e: arr){
                sum+=e;
            }
        }while(change==1);
            return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna