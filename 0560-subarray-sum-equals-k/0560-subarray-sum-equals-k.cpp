class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int count = 0; // Valid subarrays ka total count store karne ke liye
        int currSum = 0; // Current prefix sum track karne ke liye
        
        // Map store karega (prefix_sum, uski_frequency)
        unordered_map<int, int> prefixSumMap;
        
        // Base case: 0 sum ek baar pehle se exist karta hai
        // Ye tab kaam aayega jab array ke start se hi sum 'k' ke barabar ho jaye
        prefixSumMap[0] = 1;
        
        for(int i = 0; i < nums.size(); i++) {
            currSum += nums[i]; // Array mein aage badhte hue current element ko sum mein add karo
            
            // Hamein check karna hai ki kya (currSum - k) pehle kabhi map mein aaya hai?
            // Agar haan, toh iska matlab un points se current point tak ka sum exact 'k' hai
            if(prefixSumMap.find(currSum - k) != prefixSumMap.end()) {
                // Jitni baar wo purana sum aaya tha, utne naye subarrays ban gaye
                count += prefixSumMap[currSum - k];
            }
            
            // Ab is current sum ki frequency map mein increase kardo taaki aage use ho sake
            prefixSumMap[currSum]++;
        }
        
        return count; // Final result return kardo
    }
};