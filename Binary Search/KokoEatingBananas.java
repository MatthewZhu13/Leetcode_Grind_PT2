class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;
        int ans = right;

        while (left < right) {
            int middle = left + (right - left) / 2;
            int eatTime = 0;

            for (int i : piles) {
                eatTime += i / middle;
                if (i % middle > 0) {eatTime ++;}
            }
            if (eatTime <= h) {
                right = middle;
            } else {
                left = middle + 1;

            }
        }
        return left;
    }
}
