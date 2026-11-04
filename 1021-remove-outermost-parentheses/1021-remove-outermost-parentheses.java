class Solution {
    public String removeOuterParentheses(String s) {
        int l = 0,r=0;
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='(')l++;
            if(ch==')')r++;
            sb.append(ch);
           // System.out.println("          l:"+l+"r:"+r+" |"+sb);
            if(l==r){
           //         System.out.println("l:"+l+"r:"+r+" |"+sb);
                    sb.deleteCharAt(0);
                    sb.deleteCharAt(sb.length()-1);
                ans.append(sb);
            //    System.out.println("ans :"+ans);
                sb.setLength(0);

            }
            
        
    }
    return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna