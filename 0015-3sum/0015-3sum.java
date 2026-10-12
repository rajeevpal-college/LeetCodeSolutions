class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // 1. Array ko sort karna sabse zaroori hai Two-Pointer ke liye
        Arrays.sort(nums);
        int n = nums.length;
        
        // 2. Sirf ek for-loop chalayenge 'i' ke liye
        for (int i = 0; i < n - 2; i++) {
            // Agar same number wapas aa jaye toh skip kar do (duplicates avoid karne ke liye)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // 3. Two Pointers set karein
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Sum 0 mil gaya, list mein add kar do
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Left aur Right pointers ke duplicates ko bhi skip karein
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Dono pointers ko aage/peeche badhayein nayi value check karne ke liye
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    // Agar sum 0 se chhota hai, toh left pointer aage badhayein (kyunki array sorted hai)
                    left++;
                } 
                else {
                    // Agar sum 0 se bada hai, toh right pointer peeche karein
                    right--;
                }
            }
        }
        
        return ans;
    }
}