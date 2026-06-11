class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int l=0;
        int n= arr.length;
        int h=n-1,ans=-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(target == arr[mid]){
                ans=mid;
                break;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(ans==-1)
        return 0;
        int i=ans-1,j=ans+1;
        boolean change=true;
        while(change){
            change=false;
            if(i>=0&&arr[i]==target){
                i--;
                change=true;
            }
            if(j<n&&arr[j]==target){
                j++;
                change = true;
            }
        }
        return j-i-1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna