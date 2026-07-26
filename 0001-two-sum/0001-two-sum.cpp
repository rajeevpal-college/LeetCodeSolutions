class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       map<int,int>mpp;
       int n=nums.size();
       
       for(int i=0;i<n;i++){
        int num=nums[i];
       int moreneeded=target-num;
            //agar number pehle se map m h to mil gaya
            
       if(mpp.find(moreneeded)!=mpp.end()){
        return{mpp[moreneeded],i};}//braces error

        //agar nhi mila ,to current numberko map m daal do 
        mpp[num]=i;//braces error,compiler error
       }
       return{-1,-1};
       } 
    
};