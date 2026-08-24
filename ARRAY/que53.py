class Solution:
    def maxSubArray(self, nums: List[int]) -> int :


# SOLVE USING KADAN'S ALGO(OPTIMAL   SOLUTION)--------------------------------------------------#
        sum = 0 

        maxi = float('-inf')


        for i in range(len(nums)):

            sum +=nums[i]

            if sum > maxi:
                maxi = sum

            if sum < 0 :

                    sum = 0

        return maxi

        #time complexity = O(N)
        #space complexity = O(1)

        #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#
        #  BETTER SOLUTION :
        """ maxi = 0
         
         for i in range(len(nums)):          # so it time complexity is o(n^3)

            for j in range( i,len(nums)):
                sum = 0
                for k in range(i , j+1):         #  third loop is for the  for subarray we have choose to find the maximum sum among array

                    sum  += nums[k]
                    maxi = max(maxi, sum)

         return maxi

  # note = we can  also solve it by  running two loop in  whole code ."""

            

                


        