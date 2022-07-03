class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int []table = new int[26];// 26 letters
        
        for(int i = 0; i < s.length(); i++){
            table[s.charAt(i) - 97]++; 
            table[t.charAt(i) - 97]--; 
        }
        for(int element : table){
            if(element != 0) return false;
        }
        return true;
    }
}
// time complexity is: O(n)
// space complexity is: O(1) fixed index table