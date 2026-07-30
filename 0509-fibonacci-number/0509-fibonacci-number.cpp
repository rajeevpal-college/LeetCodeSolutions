// class Solution {
// public:
//     int fib(int n) {
//         int prev=0;
//         int forw=1;
//         int temp;
//         if (n>1)
//      {

//       for(int i=1;i<n;i++)
//        { //not i= zero
//         temp=forw;
//         forw=prev+forw;
//         prev=temp;
        
//        }
//       return forw;
//      }
//      else return 0;
//     }
// };


class Solution {
public:
    int fib(int n) {
     int prev=0;int forw=1;int temp;

      if (n==1){return 1;} 
      else if (n>1){
            for(int i=1;i<n;i++)
          { //not i= zero
           temp=forw;
           forw=prev+forw;
           prev=temp;
         
           }
         return forw;
        }
         else return 0;
    }
};