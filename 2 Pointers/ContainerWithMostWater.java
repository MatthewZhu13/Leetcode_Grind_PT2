class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int tempArea;
        while (left < right ) {
            tempArea = (right - left) * Math.min(height[left], height[right]);
            if (tempArea > maxArea) {
                maxArea = tempArea;
            }
            if (height[left] < height[right]) {
                left ++;
            }
            else if (height[left] >= height[right]) {
                right --;
            }
        }
        return maxArea;
    }                  
}
