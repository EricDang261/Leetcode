import java.util.Map.*;
class Solution {
    // we can use the hash map to store the frequency of the element
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0)+1);
        }
        int maxFrequencyElement = Collections.max(frequencyMap.values());

        
        for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequencyElement) {
                return entry.getKey();
            }
        }
        return -1;
    }
    
    // time complexity O(1)
    // space complexity O(n)
}