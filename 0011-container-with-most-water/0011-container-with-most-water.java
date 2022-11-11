class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxWater = 0;
        while(i < j ){
            if(height[i] < height[j]){
                maxWater = Math.max(maxWater, height[i] * (j-i));
                i++;
            }else{
                maxWater = Math.max(maxWater, height[j] * (j-i));
                j--;
            }
        }
        return maxWater;
    }
}