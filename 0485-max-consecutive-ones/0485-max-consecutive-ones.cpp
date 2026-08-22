class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
//IK Loop Lagaya Le. Ishqbaaz. Uh, one Will call. We will call Lori. The number of 1S. Georgia. Oh yeah.
 
 int maxx=0;
 int count=0;
 int n=nums.size();
 //n=size of (nums);
 //size of aur size.num m difference
 for(int i=0;i<n;i++){
    if(nums[i]==1){
        count++;
        if(count>=maxx)
        maxx=count;
        }
        else count=0;

    }
     return maxx;   
    }
};