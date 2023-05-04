class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res, subset = [], []
        nums.sort()

        def helper(i):
            if i >= len(nums):
                res.append(subset.copy())
                return

            subset.append(nums[i])
            helper(i + 1)
            subset.pop()
            
            while i + 1 < len(nums) and nums[i] == nums[i+1]:
                i += 1

            helper(i + 1)
            
        
        helper(0)
        return res