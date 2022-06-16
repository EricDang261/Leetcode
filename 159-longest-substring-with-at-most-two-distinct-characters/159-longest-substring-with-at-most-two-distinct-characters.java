class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int l = 0 , r = 0;
        int n = s.length();
        Map < Character, Integer> map = new HashMap <>();
        int maxLength = 0;
        
        // traverse the string
        
        while(r < n){
            // put the current character into the map with its index
            map.put(s.charAt(r), r);
            // incre the r ptr if there are more than 2 distinct character inside the window
            // -> the map size should always <= 2
            if(map.size() > 2){
                // find the least access index 
                int least_access_index = Collections.min(map.values());
                // remove the least index from the map ( both char and indexs)
                map.remove(s.charAt(least_access_index));
                // increment the left ptr
                l = least_access_index + 1;
            }
             // update the window length
            maxLength = Math.max(maxLength, r-l+1);
            // increment the right ptr
            r++;
        }
        return maxLength;
    }
}