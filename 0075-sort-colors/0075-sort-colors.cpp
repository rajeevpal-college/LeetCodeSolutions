// class Solution {
// public:
//     void sortColors(vector<int>& nums) {
//         int n=sizeof(nums);
//         int arr0[n];
//         int arr1[n];
//         int arr2[n];
//         int j=0;
//         int k=0;
//         int l=0;
//         int m=0;

//         for(int i=0;i<n;i++){
//             if(nums[i]==0){
//                 arr0[j]=nums[i];
//                 j++;
//             }
//             else if(nums[i]==1){
//                 arr1[k]=nums[i];
//                 k++;
//             }
//             else if(nums[i]==2){
//                 arr2[l]=2;
//                 l++;

//             }
//             int temp=j;
//             for(j=0;j<temp;j++){
//                 nums[j]=arr0[j];
//             }
//             int temp=j+k;
//             for(j;j<temp;j++){
//                 nums[j]=arr1[m];
//                 m++;
//             }
//             int temp+=l;
//             m=o;
//             for(j;j<temp;j++){
//                 nums[j]=arr2[m]
//                 m++;
//             }
//         }

        
//     }
// };
class Solution {
public:
    void sortColors(vector<int>& nums) {
        // Hum 3 pointers use karenge: low, mid, aur high
        int low = 0;                  // Yeh 0s ko track karega (left side)
        int mid = 0;                  // Yeh array ko traverse karne ke liye hai
        int high = nums.size() - 1;   // Yeh 2s ko track karega (right side)

        // Jab tak mid pointer high pointer ko cross nahi karta, loop chalega
        while (mid <= high) {
            
            if (nums[mid] == 0) {
                // Agar current element 0 hai, toh usko left side (low) bhej do
                swap(nums[low], nums[mid]);
                
                // Swap karne ke baad low aur mid dono ko aage badha denge 
                low++;
                mid++;
            }
            
            else if (nums[mid] == 1) {
                // Agar current element 1 hai, toh wo already middle mein hona chahiye
                // Isliye kuch swap nahi karna, bas aage badh jao
                mid++;
            }
            
            else { // Iska matlab nums[mid] == 2 hai
                // Agar current element 2 hai, toh usko right side (high) bhej do
                swap(nums[mid], nums[high]);
                
                // High pointer ko ek peeche le aayenge
                high--;
                
                // Dhyan de: Yahan hum mid++ NAHI kar rahe hain. 
                // Kyunki jo naya element high se swap hokar aaya hai, 
                // wo 0, 1 ya 2 kuch bhi ho sakta hai, toh usko abhi check karna baaki hai.
            }
        }
    }
};