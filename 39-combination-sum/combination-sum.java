import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        getAllCombinations(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private void getAllCombinations(int[] candidates, int target,
                                    List<List<Integer>> result,
                                    List<Integer> current,
                                    int index) {

        // base case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);  // choose
            getAllCombinations(candidates, target - candidates[i], result, current, i); 
            current.remove(current.size() - 1); // backtrack
        }
    }
}
