class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int head;
        int tail;
        for (int i = 0; i < nums.length; i++) {
            head = i + 1;
            tail = nums.length - 1;
            while (head < tail) {
                if (nums[i] + nums[head] + nums[tail] == 0) {
                    List<Integer> ansPair = new ArrayList<>();
                    ansPair.add(nums[i]);
                    ansPair.add(nums[head]);
                    ansPair.add(nums[tail]);
                    ans.add(ansPair);
                    head += 1;
                    
                }
                else if (nums[i] + nums[head] + nums[tail] < 0) {
                    head += 1;
                }
                else {
                    tail -= 1;
                }
            }
        }
        List<List<Integer>> finalAns = new ArrayList<>(ans);
        return finalAns;
    }
}   
