class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty()&&k>0&&stack.peek()>num.charAt(i)-'0'){
                stack.pop();k--;
            }
            stack.push(num.charAt(i)-'0');
        }
        while(!stack.isEmpty()&&k>0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        int l=sb.length()-1;
        while(sb.length()>0&&sb.charAt(l)=='0'){
            sb.deleteCharAt(l);
            l--;
        }
        if(sb.length()==0){
            return "0";
        }
        return sb.reverse().toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna