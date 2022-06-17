class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l =0 , r = 0;
        int maxLength = 0;
        while(r < nums.length){
            if(nums[r] == 0 || nums[l] == 0){
                r++;
                l = r ;
            }else{
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            }
        }
        return maxLength;
    }
}