class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while (white <= blue) {
            if (nums[white] == 0) {
                nums[white] = nums[red];
                nums[red] = 0;
                red++;
                white++;
            }
            else if (nums[white] == 1) {
                white++;
            }
            else {
                nums[white] = nums[blue];
                nums[blue] = 2;
                blue--;
            }
        }

    }
}
