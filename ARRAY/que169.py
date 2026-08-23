class Solution:
    def majorityElement(self, nums: List[int]) -> int:


        count = 0
        n = len(nums)


        for  i in range(n):
            count = 0

        for  j in range(n):
             if nums[i] == nums[j]:

                count +=1

    
        if count > n/2 :
            return nums[i]