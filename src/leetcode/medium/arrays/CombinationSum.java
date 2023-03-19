package leetcode.medium.arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0, candidates, target, result, new ArrayList<>());
        return result;
    }

    public void solve(int ind, int[]candidates, int target, List<List<Integer>>ans, ArrayList<Integer>temp){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if(candidates[ind]<=target){
            temp.add(candidates[ind]);
            solve(ind,candidates,target-candidates[ind],ans,temp);
            temp.remove(temp.size()-1);
        }
        solve(ind+1,candidates,target,ans,temp);

    }
}
