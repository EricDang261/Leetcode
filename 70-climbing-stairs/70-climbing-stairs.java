class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1]; // cache
        return climbStairs_helper(0, n, memo);
    }
    
    public int climbStairs_helper(int current, int n, int[]memo)
    {
        if(current > n) return 0;
        if(current == n) return 1;
        if(memo[current] != 0) return memo[current];
        memo[current] =
            climbStairs_helper(current + 1, n, memo) + climbStairs_helper(current + 2, n, memo);
        return memo[current];
    }
}