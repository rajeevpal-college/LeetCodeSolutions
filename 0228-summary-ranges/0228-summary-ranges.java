class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            
            // Advance i while the next number is consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            
            // Use StringBuilder for 0ms string construction
            StringBuilder sb = new StringBuilder();
            sb.append(start);
            if (start != nums[i]) {
                sb.append("->").append(nums[i]);
            }
            result.add(sb.toString());
        }
        
        return result;
    }
}