class Solution {
public:
    string smallestPalindrome(string s) {
        vector<int> freq(26, 0);
        
        // Step 1: frequency count
        for(char c : s) {
            freq[c - 'a']++;
        }
        
        string half = "";
        string middle = "";
        
        // Step 2: build half + find middle
        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 == 1) {
                // agar odd frequency hai, ye middle me jayega
                middle = char(i + 'a');
            }
            
            // half me freq/2 add karo (pair bana ke)
            half += string(freq[i] / 2, char(i + 'a'));
        }
        
        // Step 3: reverse half for second part
        string revHalf = half;
        reverse(revHalf.begin(), revHalf.end());
        
        // Step 4: final palindrome
        return half + middle + revHalf;
    }
};
