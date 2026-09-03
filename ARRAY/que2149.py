class Solution:
    def rearrangeArray(self, nums):
        ans = [0] * len(nums)

        pos = 0
        neg = 1

        for num in nums:
            if num > 0:
                ans[pos] = num
                pos += 2
            else:
                ans[neg] = num
                neg += 2

        return ans





        # here we need some extra space  so it space complexity is 0(N). and time complexity is 0(N)