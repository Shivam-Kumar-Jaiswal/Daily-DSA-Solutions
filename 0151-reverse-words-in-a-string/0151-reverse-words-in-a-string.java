class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] word = s.split(" ");
        String sb = "";
        System.out.print(word.length);
        Collections.reverse(Arrays.asList(word));
        for(String w:word){
            for(char ch:w.toCharArray()){
                if(ch==' '){
                    break;
                }else{
                    sb+=w;
                    sb+=" ";
                    break;
                }
            }
        }
        return sb.trim();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna