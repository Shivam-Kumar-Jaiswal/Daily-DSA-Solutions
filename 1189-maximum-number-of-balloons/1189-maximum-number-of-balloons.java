class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr= new int[5];
        for(char ch:text.toCharArray()){
            if(ch=='b')
            arr[0]=arr[0]+1;
            else if(ch=='a')
            arr[1]=arr[1]+1;
            else if(ch=='l')
            arr[2]+=1;
            else if(ch=='o')
            arr[3]+=1;
            else if(ch=='n')
            arr[4]+=1;

        }
        arr[2]/=2;
        arr[3]/=2;
        int min = arr[0];
        for(int i=1;i<5;i++){

            min=Math.min(min,arr[i]);
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna