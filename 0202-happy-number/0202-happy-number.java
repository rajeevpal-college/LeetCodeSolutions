// number ki digit alag kro  unka sq ka sum kro 

// loop rokni kab h ??
//  while (sum%100==0){.        while (n!=1){

// why wrong   set<Integer> seen =new HashSet<>();



// class Solution {
//     public boolean isHappy(int n) {

//       while (n!=1&&n!=4){
//        int sum=0;

//        while (n>0){
//        int d= n%10;
//         n=n/10;
//         sum+=d * d;
        
//        }
//        n=sum;

        
//     }
//     return n==1;
// }
// }


class Solution {
    public boolean isHappy(int n) {
  Set<Integer> seen =new HashSet<>();

      while (n!=1&&!seen.contains(n)){
        seen.add(n);
       int sum=0;

       while (n>0){
       int d= n%10;
        n=n/10;
        sum+=d * d;
        
       }
       n=sum;

        
    }
    return n==1;
}
}