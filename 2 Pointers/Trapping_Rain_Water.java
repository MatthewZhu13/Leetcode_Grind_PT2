class Solution {
    public int trap(int[] height) {
        int left_max = height[0];
        int right_max = height[height.length - 1];

        int left = 1;
        int right = height.length - 2;
        int ans = 0;
        while (left <= right) {
            if (left_max < right_max) {
                if (height[left] > left_max) {
                    left_max = height[left];
                }
                else {
                    ans += Math.max(0, left_max - height[left]);
                }
                left++;
            }
            else {
                if (height[right] > right_max) {
                    right_max = height[right];
                }
                else {
                    ans += Math.max(0, right_max - height[right]);
                }
                right--;
            }
        }
        return ans;
    }
}
