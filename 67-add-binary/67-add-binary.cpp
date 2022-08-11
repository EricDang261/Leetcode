class Solution {
public:
    string addBinary(string a, string b) {
        int sum, carry = 0;
        int i = a.size() -1;
        int j = b.size() -1;
        string result = "";
        while(i >= 0 || j >=0){
            sum = carry; // if they have carry -> sum will be initialized as 1
            if(i >=0) sum += a[i] - '0';
            if(j >=0) sum += b[j] - '0';
            
            carry = sum / 2; // it is modulo 2 and has no remainder which mean it has carry
            result += to_string(sum%2); // add the sum to the result string
          
            i--; // advanced i
            j--; // advanced j
        }
        
        if(carry == 1) result += '1' ; // if there are still carry add 1 at the end of the string 001
        // then we need to reverse the string
        cout << result;
        reverse(result.begin(), result.end());
        return result;
    }
};