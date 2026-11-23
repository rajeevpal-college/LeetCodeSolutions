import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int distinctCount = 1; // Sabse bada element (last index) count ho gaya

        // Piche se loop chalao
        for (int i = n - 2; i >= 0; i--) {
            // Agar current element pichle wale ke equal nahi hai, toh naya distinct smaller element mila
            if (nums[i] != nums[i + 1]) {
                distinctCount++;
            }
            
            // Jaise hi 3rd distinct element mile, return kar do
            if (distinctCount == 3) {
                return nums[i];
            }
        }

        // Agar 3 distinct elements nahi mile, toh largest (last element) return kar do
        return nums[n - 1];
    }
}