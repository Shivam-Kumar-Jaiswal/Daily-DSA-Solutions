class Solution {
    public int numberOfSubstrings(String s) {
        int i = 0,ans=0;
        int[] vis = new int[3];
        Arrays.fill(vis,0);
        vis[s.charAt(0)-'a']++;
        vis[s.charAt(1)-'a']++;
        for(int j =2;j<s.length();j++){
            vis[s.charAt(j)-'a']++;
            while(vis[0]>0 && vis[1]>0 && vis[2]>0){
                ans+=s.length()-(j);
                System.out.println("i : "+i+" j : "+j+" ans : "+j);
                vis[s.charAt(i)-'a']--;
                i++;
            }

            
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna