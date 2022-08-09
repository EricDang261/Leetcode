class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
            String t = ransomNote.substring(i, i+1);
            int index = magazine.indexOf(t);
            if(index == -1) return false; // not found;
            magazine = magazine.substring(0, index) + magazine.substring(index+1, magazine.length());
        }
        return true;
    }
}

