class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0; // Starting mein answer ko 0 rakhte hain kyuki 0 ^ a = a hota hai
        
        // Array ke har element par loop lagayenge
        for (int num : nums) {
            // XOR operation (^) use karenge. 
            // Iski property hoti hai ki same numbers XOR hokar 0 ho jate hain (a ^ a = 0)
            ans ^= num; 
        }
        
        // Loop khatam hone ke baad, saare pairs cancel ho jayenge (0 ban jayenge)
        // Aur jo single number bachega, wo 'ans' mein store ho jayega
        return ans; 
    }
};