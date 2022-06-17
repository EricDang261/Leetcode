class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(k == 0) return 0; // there is no distinced character
        
        int l = 0 , r = 0; 
        Map < Character, Integer > map = new HashMap<>();
        int n = s.length();
        int maxLength = 0;
        
        while(r < n){
            map.put(s.charAt(r), r); // put the character into the map
            if(map.size() > k){
                int least_access_index = Collections.min(map.values());
                map.remove(s.charAt(least_access_index));
                l = least_access_index + 1;
            }
            maxLength = Math.max(maxLength, r -l + 1);
            r++;
            
        }
        
        return maxLength;
        
        
    }
}