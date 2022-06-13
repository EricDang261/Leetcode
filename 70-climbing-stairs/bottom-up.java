class Solution {
    // n = 5
    public int climbStairs(int n) {
       // bottom up approach
        if(n == 0) return 1; // 1 step
        int[] dp = new int[n+1]; // [ ,1 ,2 , , , ] size of 6
        dp[1] = 1;
        dp[2] = 2; 
        for(int i = 3; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
