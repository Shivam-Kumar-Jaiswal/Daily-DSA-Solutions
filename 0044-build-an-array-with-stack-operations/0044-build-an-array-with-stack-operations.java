class Solution {
    public List<String> buildArray(int[] target, int n) {
        int j =0 ;
        int s=0;
        List<String> l= new ArrayList<>();    
        for(int i=1;i<=n;i++){
            if(i==target[j]){
                l.add("Push");
                s++;
                j++;
            }
            else{
                l.add("Push");
                s++;
                if(s>0){
                    l.add("Pop");
                    s--;
                }
                
            }
            if(j>=target.length)
                return l;
        }
        return l;
    }
}