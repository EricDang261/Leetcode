class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> entryMap = new HashMap<>();
        int res = 0;
        entryMap.put('I' , 1); 
        entryMap.put('V' , 5); 
        entryMap.put('X' , 10); 
        entryMap.put('L' , 50); 
        entryMap.put('C' , 100); 
        entryMap.put('D' , 500); 
        entryMap.put('M' , 1000); 
        
        for(int i = 0; i < s.length() -1 ; i++){
            char c = s.charAt(i);
            if(entryMap.get(c) < entryMap.get(s.charAt(i+1))){
                res -= entryMap.get(c);
            }else{
                res += entryMap.get(c);
            }
        }
        res += entryMap.get(s.charAt(s.length()-1));
        return res;
    }
}