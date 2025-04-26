class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for (int i : nums) {num.add(i);}
        int count = 1;
        int largestCount = 0;

        for (int i : num) {
            if (!num.contains(i - 1)) {
                while (num.contains(i + 1)) {
                    count++; 
                    i++;
                }
                if (count > largestCount) {largestCount = count;}
                count = 1;
            }
        }
        return largestCount;
    }
}
