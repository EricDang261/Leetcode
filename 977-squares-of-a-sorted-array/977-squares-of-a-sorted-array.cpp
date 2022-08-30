class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> res(nums.size());
        int i = 0;
        int j = nums.size() - 1;
        for(int a = j; a >= 0; a--){
            int square;
            if(abs(nums[i]) > abs(nums[j])){
                square = nums[i];
                i++;
            }else{
                square = nums[j];
                j--;
            }
            res[a] = static_cast <int> (pow(square, 2));
        }
        return res;
    }
};