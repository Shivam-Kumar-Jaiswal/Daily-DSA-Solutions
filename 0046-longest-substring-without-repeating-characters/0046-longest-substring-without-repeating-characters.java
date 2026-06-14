class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0,c=0,res=0;
        for(Character ch:s.toCharArray()){
            if(hm.containsKey(ch)){
                l = Math.max(hm.get(ch)+1,l);
                hm.remove(ch);
            }
            hm.put(ch,c);
            c++;
            res=Math.max(res,c-l);
            
        }
        return res; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna