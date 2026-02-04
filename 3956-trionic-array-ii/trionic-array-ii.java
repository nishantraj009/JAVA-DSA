class Solution {
    public long maxSumTrionic(int[] nums) {
        int n = nums.length;
        long[] up = new long[n];
        long[] down = new long[n];
        long[] up2 = new long[n];

        for (int i = 0; i < n; i++) {
            up[i] = down[i] = up2[i] = Long.MIN_VALUE;
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up[i] = Math.max(nums[i - 1], up[i - 1]) + nums[i];
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1] && up[i - 1] != Long.MIN_VALUE) {
                down[i] = up[i - 1] + nums[i];
            }
            if (nums[i] < nums[i - 1] && down[i - 1] != Long.MIN_VALUE) {
                down[i] = Math.max(down[i], down[i - 1] + nums[i]);
            }
        }

        long ans = Long.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1] && down[i - 1] != Long.MIN_VALUE) {
                up2[i] = down[i - 1] + nums[i];
            }
            if (nums[i] > nums[i - 1] && up2[i - 1] != Long.MIN_VALUE) {
                up2[i] = Math.max(up2[i], up2[i - 1] + nums[i]);
            }
            ans = Math.max(ans, up2[i]);
        }

        return ans;
    }
}
