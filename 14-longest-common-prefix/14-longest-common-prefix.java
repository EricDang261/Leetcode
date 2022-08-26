class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0]; // initialize the prefix  to the first string 
        for(int i = 1; i < strs.length; i++){
            // start to find the prefix
            while(strs[i].indexOf(prefix) != 0 ) // -1 not found yet
            {
                // just update the prefix ( -1 character ) every time is is not found
                prefix = prefix.substring(0, prefix.length() -1 );
                // if there is no common prefix
                if(prefix == "" ) return ""; // return empty string
            }
        }
        return prefix;
    }
}