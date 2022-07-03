class Solution {
public:
    int search(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size() -1;
        while(left <= right){
            int mid = left + (right-left)/2; // avoid overflow 
            if(nums[mid] == target) return mid; // return index -> return mid
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1; // not found
    }
};

// time complexity is O(logN);
// space complexity is O(1);