class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // Concept: Kadane's Algorithm
        // Hum 2 variables banayenge sum track karne ke liye.
        
        // current_max abhi tak ke current contiguous subarray ka sum store karega.
        // Ise hum array ke first element se initialize kar dete hain.
        int current_max = nums[0]; 
        
        // global_max pure array mein ab tak ka sabse bada sum (maximum sum) store karega.
        int global_max = nums[0];  
        
        // Array ke 2nd element (index 1) se loop start karte hain
        for(int i = 1; i < nums.size(); i++) {
            
            // CORE LOGIC (Kadane's Algorithm):
            // Har step par hum check karte hain: 
            // Kya purane sum mein current element add karna behtar hai (current_max + nums[i]), 
            // ya current element khud akela hi purane sum se bada hai (nums[i])?
            // max() ek inbuilt function hai jo dono mein se maximum value return karta hai.
            current_max = max(nums[i], current_max + nums[i]);
            
            // Agar hamara current subarray ka sum (current_max) abhi tak ke 
            // sabse bade sum (global_max) se zyada ho gaya hai, toh global_max ko update kar do.
            if (current_max > global_max) {
                global_max = current_max;
            }
        }
        
        // Loop khatam hone ke baad, jo sabse badi value mili, usko return kar do.
        return global_max;
    }
};