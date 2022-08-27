class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)) return false;
        
        int revertNum = 0;
        while(x > revertNum)
        {
            revertNum = revertNum*10 + x %10;
            x/=10;
        }
        if(revertNum == x || x == revertNum / 10)
        {
            return true;
        }
        return false;
    }
};