class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int[] ar = new int[arr.length];
        ar[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            ar[i]=Math.max(ar[i+1],arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]<ar[i+1])
                continue;
                list.add(arr[i]);        
            
        }
        list.add(arr[arr.length-1]);
            return list;

    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna