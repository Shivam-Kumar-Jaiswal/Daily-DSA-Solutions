class Solution {
    public void sort012(int[] arr) {
        // code here
        int i=0,n = arr.length;
        int j=n-1;
        while(arr[i]==0)
        i++;
        while(arr[j]==2)
        j--;
        int k = i;
        
        while(k<=j){
            
             if(arr[k]==0){
                if(k!=i){
                    swap(k,i,arr); 
                }
                i++;
                k++;
            }
            else if(arr[k]==2){
                if(k!=j){
                    swap(k,j,arr);
                }
                j--;
                
            }
            else
            k++;
        }
    }
    void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna