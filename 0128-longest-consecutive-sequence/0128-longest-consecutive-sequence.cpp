class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        //array short kro 
        //fir consecuive ki condn check kro 
        //time complexity O(n) ek loop m hi array short fir      
        int n=nums.size();
        if (n==0) return 0;
        int count=1,maxcount=1;
        //nums.sort();
        sort(nums.begin(),nums.end());
        for (int i=0;i<n-1;i++){
            int ptr=nums[i];
            int ptr1=nums[i+1];
            if (ptr==ptr1) continue;
            if(ptr+1==ptr1) count ++;
            //second wali repeated k liye 
            
            else{
            //sequence tut gaya to
            maxcount=max(maxcount,count);
            count=1;}
            

        }
        return max(maxcount,count);
    }
};