class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0,r = 0, n = fruits.length,size=0,max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < n){
            if(map.containsKey(fruits[r]) || map.size()<2){
                if(map.containsKey(fruits[r])){
                    map.put(fruits[r],map.get(fruits[r])+1);
                    r++;
                }else{
                    map.put(fruits[r],1);
                    r++;
                }
                size = r - l;
            }else{
                int x = map.get(fruits[l]);
                if(x==1)map.remove(fruits[l]);
                else map.put(fruits[l],x-1);
                l++;
            }max = Math.max(size,max);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna