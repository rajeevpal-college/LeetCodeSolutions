// methods to solve 1 2pointer 2 sortarray
// loop lage gi
// sizeof nums , nums[i]==
// nums.length;
// nums.size
// array k size , word ke size , ll ,
// ek loop m kese kr pao g
// 2pointer 3 pointer
// what to do ,missing return statement 
// error: incompatible types: int cannot be converted to boolean
//         return 0;

// string ko define , s

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         // int n= sizeof(nums);
//          ret;
//         int n= nums.length;
//         int j=n;
//         for (int i=0;i<n;i++){
//                        j--;

//            if( nums[i]==nums[j]){return true;ret=}
//            else return false;

//         }
//         return ;
        
//     }
// }

// length m bracket kab lagane h kab nhi
//2 ya multiple retruns ko ek end m kese retuen kese kre if , else

// Line 38: error: cannot find symbol
//         nums.sort();
//             ^
//   symbol:   method sort()
//   location: variable nums of type int[]


class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        // nums.sort();
        Arrays.sort(nums);

        for (int i=0;i<n-1;i++){
            if (nums[i]==nums[i+1]) return true;
        }
        return false;

        
        
    }
}
// ek bar true return ho gya to false return krne se kuch nhi hoga 



       










// 2pointer m ek pointer aage se chalta h , ek pointer pichey se chalta h , issey 2baar loop ka kam ek m hi ho jata h , i++,j-- ,i=0;j=n-1;

// 1 <= nums.length <= 10^5 (matlab $N = 10^5$, yaani array mein maximum 1,00,000 elements ho sakte hain).


// Max Constraint (N),Allowed Time Complexity,Kaisa Approach Lagana Hai?
// N≤10,O(N!) ya O(2N),"Recursion, Backtracking, Permutations"
// N≤20,O(2N),"Bitmasking, Subsets, Recursion"
// N≤500,O(N3),"3 Nested Loops, Floyd-Warshall"
// N≤103 to 5×103,O(N2),"2 Nested Loops, 2D DP"
// N≤105 to 5×105,O(NlogN) ya O(N),"Sorting, HashSet/HashMap, Two Pointers, Sliding Window"
// N≤106 to 107,Strict O(N) ya O(logN),"Single Loop, Prefix Sum, Binary Search"
// N≥109,O(logN) ya O(1),"Binary Search on Answer, Math Formula"