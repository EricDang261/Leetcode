class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin(), nums.end()); // [2,3,3];
        // given the constrain the majority of elements > [n/2] length of the array
        return nums[nums.size()/2]; // the element is always appear int he middle of the array
    }
};
