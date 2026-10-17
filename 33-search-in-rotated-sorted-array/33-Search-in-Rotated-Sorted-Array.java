

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;         // integer overflow ka condition java me integer 32 bit me store hota hai  is leye we use (low + (high - low )) instead of (low + high)
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}

    
    
    
    
    /*Initialize: low = 0, high = n - 1. */ 



/*Calculate mid = low + (high - low) / 2.



If nums[mid] == target, return mid.



Check which half is sorted:
- nums[low] <= nums[mid] → Left half is sorted.
- Otherwise → Right half is sorted.



Check the target range:
- If target lies in the sorted half, search that half.
- Otherwise, discard it and search the other half.



If low > high, return -1.         */