class NumArray:

    def __init__(self, nums: List[int]):
        self.prefix = [] 
        total = 0

        for i in range(len(nums)):
            total += nums[i]
            self.prefix.append(total)

    # [-2, 0, 3, -5, 2, -1]
    # prefix:  [-2, -2, 1, -4, -2, -3] 
    def sumRange(self, left: int, right: int) -> int:
        l = self.prefix[left - 1] if left > 0 else 0
        r = self.prefix[right]
        
        return r - l


        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)