class Solution:
    def trap(self, height: List[int]) -> int:
        left_max_iter = [0] * len(height)
        right_max_iter = [0] * len(height)
        max_num = height[0]

        for i in range(len(height)):
            left_max_iter[i] = max(max_num, height[i])
            max_num = left_max_iter[i]

        max_num = height[len(height) - 1]
        for i in range(len(height) -1 , -1, -1):
            right_max_iter[i] = max(max_num, height[i])
            max_num = right_max_iter[i]

        res = 0
        for i in range(len(height)):
            min_num = min( right_max_iter[i] , left_max_iter[i])
            res += (min_num - height[i]) if (min_num - height[i]) >=0 else 0
        
        return res
            

