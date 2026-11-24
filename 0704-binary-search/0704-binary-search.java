// binary search to , start end mid (indexes h )
// start ko update ki condition 
// if mid <target start =mid+1
// end ko update krne ki condition 
// if mid> target end=mid-1
// index return 
// if mid==target return mid ka index 

class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;

            }
            else if (nums[mid]>target ){
                end=mid-1;
            }
        }
        return -1;
        
    }
}