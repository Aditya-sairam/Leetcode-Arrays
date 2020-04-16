class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_num = max(nums)
        sum_num = 0
        i = 0
        while i < len(nums):
            sum_num += nums[i]
            if nums[i] > 0:             
                if sum_num > max_num:
                    max_num = sum_num
            else:
                if sum_num < 0:
                    sum_num = 0
            i += 1
        return max_num 
