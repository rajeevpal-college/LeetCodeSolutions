//given array ko sort kro fir element count kro then    loop lagao and check kro kon sa element nhi h

// how to check kon sa element nhi h ,

// why wrong        int n=nums.length();


class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);

int r,i;
        for(i=0;i<n;i++){
            if (nums[i]!=i)
            // break;
            return i ;

        }
   return n;

        
    }
}