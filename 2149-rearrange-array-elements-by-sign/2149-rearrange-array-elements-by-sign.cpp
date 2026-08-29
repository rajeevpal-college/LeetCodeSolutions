class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n= nums.size();
        //2 array half half ki 
        int parra[n/2],j=0; //positive number ki array
        int narra[n/2],k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                parra[j]=nums[i];
                j++;
            }
            else if (nums[i]<0){
                narra[k]=nums[i];
                k++;

            }

        }
        j=0,k=0;
        for (int i=0;i<n/2;i++){
            //2i 2i+1 nhi 2*i 2*i+1
            nums[2*i]=parra[j];
            j++;
            nums[2*i+1]=narra[k];
            k++;
        }
        return nums;
        
    }
};