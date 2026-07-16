class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0,j=0,max=0;
        while(j<fruits.length){
            if(map.containsKey(fruits[j])){
                int x =map.get(fruits[j]);
                map.put(fruits[j],x+1);
                j++;
            }else {
                map.put(fruits[j],1);
                j++;
            }
            if(map.size()>2){
                if(map.get(fruits[i])<2)
                map.remove(fruits[i]);
                else{
                    int x = map.get(fruits[i]);
                    map.put(fruits[i],x-1);
                }
                i++;
            }
            if(map.size()<=2){
                max=Math.max(max,j-i);
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna