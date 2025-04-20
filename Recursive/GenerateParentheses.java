class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String s = "";
        if (n == 1) {
            ans.add("()");
            return ans;
        }
        dfs(0, 0, ans, s, n);
        return ans;

    }
    public void dfs (int left, int right, List<String> ans, String s, int n) {
        if (left == right && left == n) {
            ans.add(s);
            return;
        }

        if (left < n) {
            dfs(left + 1, right, ans, s + "(", n);
        }
        if (right < left) {
            dfs(left, right + 1, ans, s + ")", n);
        }


    }
}
