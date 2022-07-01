class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int l = 2, r = x/2;
        long num = 0 ; // to check if the num square  = original number
        while(l <= r){
            int guess = l + (r-l)/2; // avoid the overflow
            num = (long) guess * guess;
            if(num > x){
                r = guess - 1;
            }else if( num < x){
                l = guess + 1;
            }else{
                return guess; 
            }
        }
        return r;
    }
}