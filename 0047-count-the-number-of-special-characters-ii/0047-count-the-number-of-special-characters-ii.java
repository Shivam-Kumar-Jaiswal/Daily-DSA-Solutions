class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<word.length();i++){
            char a = word.charAt(i);
            if(a<'a'){
                if(!map.containsKey(a))
                map.put(a,i);
            }
            else
            map.put(a,i);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char key = entry.getKey();int v=entry.getValue();
            if(key>='a'&&key<='z'){
                Integer B=map.get((char)(key-32));
                
                if(B!=null&&B>v){
                    count++;
                }
            }
        }
    return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna