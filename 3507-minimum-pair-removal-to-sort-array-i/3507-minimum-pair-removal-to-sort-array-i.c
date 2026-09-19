
#include<stdbool.h>
#include<limits.h>
//int minimumPairRemoval(int* nums, int numsSize) {
    bool isSorted(int* nums , int size){
        for (int i =0;i<size-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;

    }

    int minimumPairRemoval(int* nums, int numsSize){
        int operations=0;

        while(!isSorted(nums,numsSize)){
            int minSum=INT_MAX;
            int minIndex=-1;

            for(int i=0;i<numsSize-1;i++){
                int currentSum=nums[i]+nums[i+1];
                if(currentSum<minSum){
                    minSum=currentSum;
                    minIndex=i;
                }
            }

            nums[minIndex]=minSum;

            for(int i=minIndex+1;i<numsSize-1;i++){
                nums[i]=nums[i+1];
            }

            numsSize--;
            operations++;
            
        
    }
    return operations;
    
}