

import java.util.Arrays;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long sum = sumOfDivisor(nums, mid);

            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public long sumOfDivisor(int[] nums, int divisor) {

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + divisor - 1) / divisor;
        }

        return sum;
    }
}
