class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min_price = INT_MAX; // Start with the highest possible integer
        int max_profit = 0;      // If we can't make a profit, we return 0

        for (int i = 0; i < prices.size(); i++) {
            if (prices[i] < min_price) {
                // Update the minimum price we've seen so far
                min_price = prices[i];
            } else if (prices[i] - min_price > max_profit) {
                // Update the maximum profit if selling today is better
                max_profit = prices[i] - min_price;
            }
        }
        
        return max_profit;
    }
};