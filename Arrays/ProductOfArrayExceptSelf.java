class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left_prefix = new int[nums.length];
        for (int i = 0; i < left_prefix.length; i++) {
            left_prefix[i] = 1;
        }

        for (int i = 0; i < left_prefix.length - 1; i++) {
            left_prefix[i + 1] = left_prefix[i] * nums[i];
        }
        for (int i = nums.length - 2; i > -1; i--) {
            left_prefix[i] *= nums[i + 1];
            nums[i] *= nums[i + 1]; 
        }
        return left_prefix;
}
