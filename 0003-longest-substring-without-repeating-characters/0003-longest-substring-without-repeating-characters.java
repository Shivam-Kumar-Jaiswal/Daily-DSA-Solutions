class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int last = 0;
        int max = 0;
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                last = Math.max(map.get(s.charAt(i))+1,last);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-last+1);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna