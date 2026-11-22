//chechk kre g ki kon si baddi h 
// loop lagae g do bar i se badi  wali ka elemen nums1[i] fir j se nums2[j] if usko k=0 nums1[k ]  k++ m dal dengey aur k++ 
// nums1[i]==nums2[j] 

// return Arrays.copyOfRange(nums1, 0, k);

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int k=0;

        for(int i=0; i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[k]=nums1[i];
                    k++;
                    nums2[j]=-1;
                    break;

                }
            }
        }
        // return nums1; //isse nums 1 ke extra element bhi aaye g 

        return Arrays.copyOfRange(nums1, 0, k);
        
    }
}


// int[] ans = new int[k];
// for (int i = 0; i < k; i++) {
//     ans[i] = nums1[i];
// }
// // return ans;

// (Asal mein Arrays.copyOfRange(nums1, 0, k) bhi internally bilkul yehi kaam karta hai — bas 1 line mein!)

// Doosra option: Agar nums1 ko modify hi nahi karna chahte, toh ArrayList<Integer> mein elements add karte jao aur end mein int[] array bana kar return kar do