// class Solution {
// public:
//     bool check(vector<int>& nums) {

//         //advanced array 
//         //array kese create krtey h 
//         //int arra narra={5,7,3,9,2,8}
//         int narra[] //={5,7,3,9,2,8}
//         int prev ,next,temp;
//         prev=narra[0];
//         next=narra[1];
//         for (int i=0;i<n;i++){
//             temp=next
//             if(prev>next){
//                 next=prev
//                 prev=temp
//             }
//         }
//       //return true , return false 
        
//     }
// };




// class Solution {
// public:
//     bool check(vector<int>& nums) {

//         //advanced array  //array kese create krtey h  //int arra narra={5,7,3,9,2,8}  //int nums[]; //={5,7,3,9,2,8}
//         int prev ,next,temp,n;
//         prev=nums[0];
//         next=nums[1];
//         n=nums.size(); //nums.sizeof (nums)
//         for (int i=0;i<n;i++){
//             temp=next;
//             if(prev>next){
//                 next=prev;
//                 prev=temp;
//             }
//         }
//       //return true , return false 
//       return true;
        
//     }
// };







//given array orginally sorted h ?? then array ko rotate kro agar orginal array sorted thi , agar originall array sorted nhi h to false return kro 


// array ka name nums h , 
//true tab return krna h- jab originall array sorted h aur kisi x positions roated h 
//otherwise false return kro 

class Solution 
{
public:
    bool check(vector<int>& nums)
     { //advanced array  //array kese create krtey h  //int arra narra={5,7,3,9,2,8}  //int nums[]; //={5,7,3,9,2,8}

        int prev ,next,temp,n;
        int count=0;
        prev=nums[0];
        next=nums[1];
        n=nums.size(); //nums.sizeof (nums)
        
        for (int i=0;i<n;i++)
        {
             prev=nums[i];
             next=nums[(i+1)%n];
                
            temp=next;
            if(prev>next) // if(prev[i]>next[i+1]) prev next arry thodi h
            {
                // prev=nums[i];
                // next=nums[i+1];
                
                // next= prev;    //kya isse value update ho rhi h nums i , nums i+1p  //next[i]=prev[i];
                // prev=temp;
                count++;     //esa to nhi ki ye count for loop k andar reh gya h , bahar count 0 mil rha h 
            }
        }
          if (count<=1)     //return true , return false
                          
           return true;
           else return false;
        //   else if (count>1) return false;
        
        //wanting default return
     }
   // return true;
};