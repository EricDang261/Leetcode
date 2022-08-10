class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1); // get the frequency of the character in the string 
        }
        int result = 0;
        boolean foundOdd = false;
        for(int count : map.values()){
            if(count % 2 == 1){
                foundOdd = true;
                result += count-1;
            }else{
                result += count;
            }
        }
        if(foundOdd) result++;
        return result;
    }
}