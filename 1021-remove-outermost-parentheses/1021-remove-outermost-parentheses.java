class Solution {
    public String removeOuterParentheses(String s) {
        int op=0,cl=0;
        StringBuffer sb = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(op!=0)temp.append('(');
                op++;
            }
            else if(ch==')'){
                if(op!=1&&cl!=op-1)
                temp.append(')');
                cl++;
                if(op==cl){     
                    sb.append(temp);
                    temp.setLength(0);
                    op=0;cl=0;
                }   
            }
            
                
            
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna