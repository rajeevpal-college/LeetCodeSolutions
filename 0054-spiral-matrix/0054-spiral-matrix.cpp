class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        
        // Agar matrix khali hai, toh empty vector return kar do
        if (matrix.empty()) return ans;

        int m = matrix.size();
        int n = matrix[0].size();

        // Hum 4 boundaries set karenge
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        // Jab tak boundaries ek dusre ko cross nahi karti, tab tak loop chalega
        while (top <= bottom && left <= right) {
            
            // 1. Left se Right traverse karenge (top row par)
            for (int i = left; i <= right; i++) {
                ans.push_back(matrix[top][i]);
            }
            top++; // Top row cover ho gayi, toh top boundary ko niche shift kar do

            // 2. Top se Bottom traverse karenge (rightmost column par)
            for (int i = top; i <= bottom; i++) {
                ans.push_back(matrix[i][right]);
            }
            right--; // Right column cover ho gaya, toh right boundary ko left shift kar do

            // 3. Right se Left traverse karenge (bottom row par)
            // Condition check karna zaroori hai ki kya top abhi bhi bottom se chhota ya barabar hai
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--; // Bottom row cover ho gayi, toh bottom boundary ko upar shift kar do
            }

            // 4. Bottom se Top traverse karenge (leftmost column par)
            // Yahan bhi check karenge ki kya left boundary ne right ko cross toh nahi kiya
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.push_back(matrix[i][left]);
                }
                left++; // Left column cover ho gaya, toh left boundary ko right shift kar do
            }
        }

        return ans; // Finally, spiral order wala vector return kar do
    }
};