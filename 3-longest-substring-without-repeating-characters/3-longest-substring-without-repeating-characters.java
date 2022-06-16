class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set < Character> set = new HashSet <> ();
        int n  = s.length();
        int l = 0, r = 0;
        int maxLength = 0;
        
        while ( r < n){
            if(!set.add(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            else{
                set.add(s.charAt(r)); // add the current char into the set
                maxLength = Math.max(maxLength, set.size());
                r++;
            }
        }
        System.out.println(set);
        return maxLength;
    }
}