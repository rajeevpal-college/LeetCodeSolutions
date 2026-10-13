// //List kese declare krtey h 
// //return m multiple items nhi return kr skte without array LL
// //size cpp m tha size of() c m tha . length function() aur only length kab ??
// //sort function and sort na krne pr duplicate ky
// //HashTable kyu instead of list
// //i j=i+1 k=j+1 kyu
// //convert HashSet back in List of Lists
// //nums.sort ya sort.nums m kya dikkat h ?? no symbol nums ke andar sort nhi h
// // sort.nums; // nums.sort();
// // abhi intne sare output m kyu aa rhey h , array use krne pr lop use krney pr ??? i,j,k =0 se start pr
// //case repeat kyu ho rhey i j=i+1 k=j+1
// // List<List<Integer>> ans = new ArrayList<>();declare set? HashSet??
// //ans.add(Arrays.asList(nums[i],nums[j],nums[k]));   && 
// //return ans; iski jhg set m?? list ko set m convert kese ??
// //Set<List<Integer>>ansList =new HashSet<>(); galat kyu


// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
// //3no ka sum 0,p values  

// int n=nums.length; //size cpp m tha size of() c m tha . length function() aur only length kab ??
// Arrays.sort(nums);//utility class of array
// Set<List<Integer>> ansSet=new HashSet<>();




// //m1 3 loop ijk nums[i]+nums[j]+nums[k]==0
//      for (int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             for(int k=j+1;k<n;k++){
//             if(nums[i]+nums[j]+nums[k]==0){
//                 // loop laga ke l m n int man kr value put kr dengey ek new arrya m 
//                 // then new array return kr dengey

//                 // ansSet.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                 ansSet.add(Arrays.asList(nums[i], nums[j], nums[k]));

                

//                 // return nums[i];nums[j];nums[k];
//                 // retutn m list chaiye individual snhi
//             }
//         }
//     }
// }
// return new ArrayList<> (ansSet);
//     }
// }
// //ans
// //8 nums ke andar sort nhi h and not valid syntax utility class use kro in java for array sort
// //11repeated value in input ki wjh se ;use Hastable instead of Array List
// //13 set<List<Integer>> name= new HashSet<>(); <> angle brackets diamond ;kis type  ka data store kre ga ;object create krtey time ;data smj lega left se bar bar mention ki jarurat nhi
// //14 return new ArrayList<>(ansSet);
// //<> (Diamond Operator): Yeh Data Type ke liye hota hai. Iska kaam hai Java ko batana ki "left side mein jo type likha hai (List<Integer>), wahi type idhar bhi aayega". Isse aapko baar-baar lamba data type nahi likhna padta.
// // () (Constructor Brackets): Yeh Object banane ke liye hota hai. Java mein jab bhi hum new keyword se koi naya object banate hain, toh humein constructor call karna padta hai, jiske liye () lagana zaroori hai.

class Solution{
    public List<List<Integer>>threeSum(int [] nums){
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n=nums.length;

        //3loop se ncube nhi 1 loop m hi 3no
        for(int i=0;i<n-2;i++){ //n nhi n-2 oveflow stop
        if(i>0&& nums[i]==nums[i-1]){
            continue;
        }
        //2 pointer left right set kro
        int left=i+1;
        int right=n-1;
         
         while(left<right){
            int sum= nums[i]+nums[left]+nums[right];

            if(sum==0){
                ans.add(Arrays.asList(nums[i],nums[left],nums[right]));

                while(left<right && nums[left]==nums[left+1])left++;
                while(left<right&& nums[right]==nums[right-1]) right--;
                
                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
         }
        }
    return ans;


    }

}


