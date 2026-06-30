class Solution {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
                if(st.isEmpty()){
                    st.push(c);
                }
                else{
                    while(!st.isEmpty()&&prec(c)<prec(st.peek()))
                    sb.append(st.pop());
                
                    if(!st.isEmpty()&&prec(c)>prec(st.peek()))
                    st.push(c);
                    else{
                        if(prec(c)==4)
                        st.push(c);
                        else{
                            if(!st.isEmpty())sb.append(st.pop());
                            st.push(c);
                        }
                    }
                }
            }
            else if(c=='(')
            st.push('(');
            else if(c==')'){
                while(st.peek()!='(')
                sb.append(st.pop());
                st.pop();
            }
            else{
                sb.append(c);
            }
        }
        
        
        
        
        
        
        
        
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
    static int prec(char c){
        if(c=='^')
        return 4;
        else if(c=='/'||c=='*')
        return 3;
        else if(c=='(')
        return 1;
        else return 2;
        }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna