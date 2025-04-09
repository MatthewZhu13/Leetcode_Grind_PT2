import java.util.HashMap; 
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] charCount = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                charCount[strs[i].charAt(j) - 'a'] ++;
            }

            StringBuilder count = new StringBuilder();
            for (int k = 0; k < 26; k++) {
                count.append((char)charCount[k]);
            }
            
            String word = count.toString();
            if (!ans.containsKey(word)) {
                ans.put(word, new ArrayList<String>());
            }

            ans.get(word).add(strs[i]);

        }
        List<List<String>> ans2 = new ArrayList<>(ans.values());
        return ans2;
    }
}
