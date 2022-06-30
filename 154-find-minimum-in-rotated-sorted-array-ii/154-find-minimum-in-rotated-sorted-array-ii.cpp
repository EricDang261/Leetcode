class Solution {
public:
    int findMin(vector<int>& nums) {
        int l = 0, h = nums.size()-1;
        while(l < h){
            int pivot = (l + h )/ 2;
            if(nums[pivot] > nums[h]){
                l = pivot + 1;
            }else if( nums[pivot] < nums[h] ){
                h = pivot; 
            }else{
                h -= 1;
            }
        }
        return nums[l];
    }
};