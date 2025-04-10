import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (Integer i : nums) {
            if (!count.containsKey(i)) {count.put(i, 0);}
            count.put(i, count.get(i) + 1);
        }
        List<Integer>[] ans = new List[nums.length + 1];
        for (int i : count.keySet()) {
            if (ans[count.get(i)] == null) {
                ans[count.get(i)] = new ArrayList<>();
            }
            ans[count.get(i)].add(i);
        }

        List<Integer> final_ans = new ArrayList<>();
        for (int i = nums.length; i >= 0 && final_ans.size() < k; i --) {
            if (ans[i] != null) {
                final_ans.addAll(ans[i]);
            }
        }
        return final_ans.stream().mapToInt(i->i).toArray();
        
    }
} 
