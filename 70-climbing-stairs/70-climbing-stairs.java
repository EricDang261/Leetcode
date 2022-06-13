class Solution {
    // n = 5
    public int climbStairs(int n) {
       // bottom up approach
        if(n < 2) return 1; // 1 step
        int first = 1;
        int second = 2; 
        for(int i = 3; i <= n ; i++){
            int third = first + second;
            first = second; 
            second = third;
        }
        return second;
    }
}