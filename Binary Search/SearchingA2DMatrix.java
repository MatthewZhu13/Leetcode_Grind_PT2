class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int m = matrix[0].length;
        while (left <= right) {
            int middle = (right + left) / 2;
            if (matrix[middle][0] <= target && matrix[middle][m - 1] >= target) {
                int l = 0;
                int r = m - 1;
                while (l <= r) {
                    int mid = (r + l) / 2;
                    if (matrix[middle][mid] == target) {
                        return true;
                    }
                    else if (matrix[middle][mid] < target) {
                        l = mid + 1;
                    }
                    else {
                        r = mid - 1;
                    }
                }
                return false;
            }
            else if (target < matrix[middle][m - 1]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return false;
    }
}
