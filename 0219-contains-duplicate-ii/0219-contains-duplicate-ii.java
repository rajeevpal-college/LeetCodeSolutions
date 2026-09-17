// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         //int j=nums.length-1;
//         for(int i=0;i<nums.length;i++){
//             for (int j=0;j<nums.length;j++){
//             if(i!=j&&nums[i]==nums[j]&&(Math.abs(i-j)<=k)){
//             //((i-j<=k)||(j-i<=k))){   //((i-j<=k)&&(j-i>=k))){
//                 return true;}
//                 //j--;
            
//         }
//         }
//         return false;
        
        
//     }
// }

//capital HashMap, Integer,containsKey,Math.abs()
//newconcept:HashMap<>map=new HashMap<>();
//map.conatainKey(),map.get(),map.put,Maths.abs()


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
           
            if(map.containsKey(nums[i])){
                int j=map.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }    
            
              map.put(nums[i],i);
            
        
        }
        return false;
        
        
    }
}