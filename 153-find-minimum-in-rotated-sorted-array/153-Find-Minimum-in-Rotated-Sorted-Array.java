class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){

            int mid = (low + high)/2;

       if (nums[low] <= nums[high]) {
            ans = Math.min(ans, nums[low]);
            break;


       }
        else if (nums[low] <= nums[mid]) {
           ans = Math.min(ans, nums[low]);
          low = mid + 1;
         }

        else {
        ans = Math.min(ans, nums[mid]);
         high = mid - 1;
          }
        }
          return ans;


        
    }
}


/*
Revision points:
1. Sorted range check: nums[low] <= nums[high] → minimum is nums[low]; then break.
2. Initialize answer: int ans = Integer.MAX_VALUE;
3. Left half sorted: nums[low] <= nums[mid] → minimum of this half is nums[low]; update ans, then low = mid + 1.
4. Otherwise: minimum lies in the left unsorted half, including mid; update ans = Math.min(ans, nums[mid]), then high = mid - 1.
5. Always update ans before eliminating a range that could contain the minimum.
*/