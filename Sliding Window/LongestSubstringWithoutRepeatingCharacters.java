class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int i = 0, j = 0, max = 0;
        
        while (i < s.length()) {
            if (!ans.contains(s.charAt(i))) {
                ans.add(s.charAt(i));
                i++;
                max = Math.max(max, ans.size());
            }
            else {
                ans.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}
