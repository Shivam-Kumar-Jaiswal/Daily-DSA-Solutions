class Solution {
    public List<Integer> getRow(int rowIndex){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int el=1;
        for(int i=1;i<=rowIndex;i++){
            el=el*(rowIndex+1-i)/i;
            ans.add(el);
        }
        return ans;
    }
}