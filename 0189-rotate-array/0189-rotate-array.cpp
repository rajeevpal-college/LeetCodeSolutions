class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        
        // Agar k array ke size se bada hai, toh cycle wapas repeat hoti hai.
        // Isliye k = k % n kar lete hain taaki extra ghumna na pade.
        k = k % n; 
        
        // Step 1: Pure array ko ulta (reverse) kar do.
        // Example: Agar array [1,2,3,4,5,6,7] hai aur k = 3 hai
        // Reverse ke baad array ban jayega: [7,6,5,4,3,2,1]
        reverse(nums.begin(), nums.end());
        
        // Step 2: Shuru ke 'k' elements ko wapas reverse karo.
        // Ab shuru ke 3 elements (7,6,5) ban jayenge (5,6,7)
        // Array ab aisa dikhega: [5,6,7, 4,3,2,1]
        reverse(nums.begin(), nums.begin() + k);
        
        // Step 3: Baki bache hue n-k elements ko reverse kar do.
        // Baki bache elements (4,3,2,1) ban jayenge (1,2,3,4)
        // Final array aapka tayyar hai: [5,6,7,1,2,3,4] (Ho gaya rotate!)
        reverse(nums.begin() + k, nums.end());
    }
};