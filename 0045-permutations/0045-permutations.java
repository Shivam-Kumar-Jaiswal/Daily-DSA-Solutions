public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // Base case: if the current permutation is complete
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                // Since the integers are distinct, we can skip if the element is already used
                if (tempList.contains(nums[i])) continue; 
                
                tempList.add(nums[i]);
                backtrack(result, tempList, nums);
                
                // Remove the last element to backtrack and try the next integer
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
