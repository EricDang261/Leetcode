class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int counter = 0;
        for(int i = 0 ; i < n; i++){
            System.out.print(i + " ");
            if( nums[i] != counter){
                return i;
            }
            counter++;
        }
        return n; // last index
    }
}