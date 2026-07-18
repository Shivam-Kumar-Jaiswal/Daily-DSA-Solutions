class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] arr =   {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        List<String> ans = new ArrayList<>();
        helper(0,digits,arr,digits.length(),"",ans);
        return ans;
    }
    void helper(int i,String digits,char[][] arr,int l,String s,List<String> ans){
        if(i>=l){
            ans.add(s);
            return;
        }
        int r=digits.charAt(i)-'2';
        int c=arr[r].length;
        for(int j=0;j<c;j++){
            helper(i+1,digits,arr,l,s+arr[r][j],ans);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna