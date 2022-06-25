class Solution {
    public boolean checkPossibility(int[] nums) {
        int violation = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > nums[i]){
                if(violation == 1){
                    return false;
                }
                violation++;
                if(i < 2 || nums[i-2] <= nums[i]){
                    nums[i-1] = nums[i];
                } else{
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}