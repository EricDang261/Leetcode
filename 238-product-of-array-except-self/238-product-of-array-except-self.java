class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        
        l[0] = 1;
        r[nums.length -1] = 1;
        for(int i = 1 ; i < nums.length; i++){
            l[i] = nums[i - 1] * l[i-1];
        }
        
        for(int j = nums.length -2 ; j >= 0; j--){
            r[j] = nums[j + 1 ] * r[j+1];
        }
        
        for(int i = 0; i < nums.length; i++){
            ans[i] = l[i] * r[i];
        }
        
        return ans;
        
    }
    

}