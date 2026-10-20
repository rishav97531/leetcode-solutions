
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Pair is correct; single element is on the right
                low = mid + 2;
            } else {
                // Pair is broken; single element is here or on the left
                high = mid;
            }
        }

        return nums[low];
    }
}
/* Revision points (remember these 5 things):
1. Pair pattern: Before the single element, pairs start at even indices: (0,1), (2,3), (4,5).
2. Boundary checks: If nums[0] != nums[1], return nums[0]. If nums[n-1] != nums[n-2], return nums[n-1].
3. Check mid: If nums[mid] differs from both neighbors, it's the single element.
4. Binary search logic:
   - If mid is odd and matches the previous element, or mid is even and matches the next element → the pair is correctly aligned; search right.
   - Otherwise → search left.
5. Important: Keep the low and high updates consistent so you don't skip the single element.*/