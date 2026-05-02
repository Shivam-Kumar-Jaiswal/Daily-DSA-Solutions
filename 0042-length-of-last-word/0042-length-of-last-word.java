class Solution {
    public int lengthOfLastWord(String s) {
        int x=s.length()-1,c=0;
        for(;x>=0;x--){
            if(s.charAt(x)==' '&&c>0)
            break;
            if(s.charAt(x)!=' ')
            c++;
        }
        return c;
    }
}