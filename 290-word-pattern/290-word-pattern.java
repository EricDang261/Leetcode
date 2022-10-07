class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charMap = new HashMap();
        String[] words = s.split(" "); // [dog, cat, cat, dog];
        
        if( pattern.length() != words.length) return false;
        
        for(int i = 0; i < words.length; i++){
            char ch = pattern.charAt(i); // curent character in the pattern
            String word = words[i]; // current word in words;
            
            if(!charMap.containsKey(ch)){
                if(charMap.containsValue(word))
                    return false;
                else
                    charMap.put(ch, word);
                
            }else{
                if(!charMap.get(ch).equals(word))
                    return false;
            }
        }
        return true;
    }
}