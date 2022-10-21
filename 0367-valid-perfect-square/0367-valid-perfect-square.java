class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
          return true;
        }
        long left = 2;
        long right = num /2 ;
        while(left <= right){
            long mid = (left + right)/2;
            if(mid * mid == num)
                return true;
            else if(mid * mid < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false; // cant found
    }
}