class Solution {
    public boolean isPalindrome(String s) {
        String newString = "" ; // this new string will not contain punctuations
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newString += s.charAt(i);
            }
        }
        return isValidPalindrome(newString);
    }
    public boolean isValidPalindrome(String s){
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        } 
        return true;
    }
}