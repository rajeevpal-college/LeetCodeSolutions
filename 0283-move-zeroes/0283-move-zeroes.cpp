// class Solution {
// public:
//     void moveZeroes(vector<int>& nums) {
//         vector<int> temp;
//         int j=0;
//         int n=sizeof(nums);
//         //temp m non zero element put krna 
//         for (int i=0;i<n;i++){
//             if(nums[i]!=0)
//             temp[j]=nums[i];
//             j++;
//         }
//         //temp k non zero element starting end of array m put krna 
//         int N=sizeof(temp);
//         for(int i=0;i<N;i++){
//             nums[i]=temp[i];

//         }
//         //remainig element ko zero krna
//         for (int i=N;i<n;i++){
//             nums[i]=0;

//         }
        
//     }
// };


class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int> temp;
        int n = nums.size(); // Sahi tareeka array ka size nikalne ka
        
        // temp m non zero element put krna
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp.push_back(nums[i]); // Sahi tareeka naya element dalne ka
            }
        }
        
        // temp k non zero element wapas nums array m put krna
        int N = temp.size(); // Sahi tareeka temp ka size nikalne ka
        for (int i = 0; i < N; i++) {
            nums[i] = temp[i];
        }
        
        // remaining element ko zero krna
        for (int i = N; i < n; i++) {
            nums[i] = 0;
        }
    }
};