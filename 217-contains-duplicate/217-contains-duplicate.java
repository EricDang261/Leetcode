class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setEntry = new HashSet<>();
        for(int i : nums){
            if(!setEntry.add(i)){
                return true;
            }
        }
        return false;
    }
}