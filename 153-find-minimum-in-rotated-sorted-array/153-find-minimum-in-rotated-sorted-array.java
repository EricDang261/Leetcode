class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0]; // just have 1 index
        
        int l = 0, r = nums.length - 1;
        int min = nums[0]; // assume the 1st element of the array is min
        while(l < r){
            int mid = l + (r - l)/ 2; // ~ (l + r) / 2
            
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return nums[l];
    }
}