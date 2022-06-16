class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        
        while(r < n){
            sum += nums[r];
            while(target <= sum){
                min = Math.min(min, r - l + 1);
                sum -= nums[l++];
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? 0: min;
    }
}