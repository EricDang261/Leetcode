class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()) return addBinary(b,a);
        StringBuilder strbd  = new StringBuilder();
        int carry = 0;
        int j = b.length() -1; // the last character in string b
        for(int i = a.length() -1 ; i >= 0; i--){
            if(a.charAt(i) == '1') ++carry;
            if( j >= 0 && b.charAt(j--) == '1' ) ++carry;
            if(carry % 2 == 1) strbd.append('1'); // no carry
            else strbd.append('0'); // has carry
            carry /= 2; 
            
        }
        
    }
}
