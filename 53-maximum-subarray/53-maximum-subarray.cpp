class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(nums.size() == 1) return nums[0];
        int currentMax = nums[0];
        int maxRes = nums[0];
        
        for(int i = 1; i < nums.size() ; i++){
            currentMax = max(nums[i], nums[i] + currentMax);
            maxRes = max(currentMax, maxRes);
        }
        
        return maxRes;
    }
};