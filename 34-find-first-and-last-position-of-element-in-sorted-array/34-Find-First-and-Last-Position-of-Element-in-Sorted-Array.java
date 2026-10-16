class Solution {
    public int[] searchRange(int[] nums, int target) {
        

        int first  = findfirst(nums, target);
        int last = findlast(nums,target);

        return new int []{first,last};
    }
    

    private int findfirst(int[] nums , int target) {
        int low = 0; 
        int high = nums.length -1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] == target){
                ans = mid;
                high = mid - 1;      // search left
            }

             else if (nums[mid]< target){
               low = mid +1;
                   } else{
                            high = mid -1;
                          }
            
        }

        return ans;

      }

        private int findlast(int[] nums,int target) {
            int low = 0;
            int high = nums.length - 1;      //1. Sorted array → Think of Binary Search.
                                             //2. Find first occurrence → When nums[mid] == target, store mid, then move left: high = mid - 1.
                                           // 3. Find last occurrence → When nums[mid] == target, store mid, then move right: low = mid + 1.
                                            //4. Initialize ans = -1 so the answer stays -1 if the target isn't found.
                                            //5. Complexity: Time \(O(\log n)\), auxiliary space \(O(1)\).
            int ans = -1;

               while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1; // Search right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;

        } 
}
