class Solution {
    public int climbStairs(int n) {
        // Base cases: if n is 1, 2, or 3, the number of ways is just n
        if (n <= 3) {
            return n;
        }
        
        int prev2 = 2; // Ways to reach stair 2
        int prev1 = 3; // Ways to reach stair 3
        int current = 0;
        
        // Calculate ways for each stair from 4 up to n
        for (int i = 4; i <= n; i++) {
            current = prev1 + prev2; // Ways(i) = Ways(i-1) + Ways(i-2)
            prev2 = prev1;           // Shift window forward
            prev1 = current;
        }
        
        return current;
    }
}