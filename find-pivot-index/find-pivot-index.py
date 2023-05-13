class Solution:
     
    # [1,7,3,6,5,6]
    # sum of this array = 28
    # left = a[0] = 1 + 7 + 3 = 11 -> return left + 1 which is the index -  pivot indx
    # right = a[len(a) - 1] = sum - 6 -5 - 6 = 11
    def pivotIndex(self, nums: List[int]) -> int:

        r_val = sum(nums)
        l = 0
        l_val = 0

        while l < len(nums):
            r_val -= nums[l]
            if l_val == r_val: 
                return l
            l_val += nums[l]
            l+=1
            
        return -1 # not found 


   