class Solution {
    public String countAndSay(int n) {
        if(n==1)
        return "1";
        String ans =countAndSay(n-1);
        StringBuffer solution = new StringBuffer();
        for(int i=0;i<ans.length();){
            int j=i+1;
            while(j<ans.length()&&ans.charAt(i)==ans.charAt(j)){
                j++;
            }
            solution.append(j-i);
            solution.append(ans.charAt(i));
            i=j;
        }
        return solution.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna