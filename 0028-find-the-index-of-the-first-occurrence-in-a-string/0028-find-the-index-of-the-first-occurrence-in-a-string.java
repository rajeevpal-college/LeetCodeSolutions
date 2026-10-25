//why square bracket[]only for array not as common braces
//why -1 in int k=needle.length()-1;
//why break is not working in this instead we have to use .length()-.length()
//i<haystack.length()-needle.length(); m esa kyu kiya 
// i<=haystack.length()-needle.length();


// why so much mistakes 
// for(int i=0;i<=haystack.length()-needle.length();i++){
//             if (haystack.charAt(i)==needle.charAt(j)
//         //     &&
//         // haystack.charAt(i+k)==needle.charAt(j+k)
//         ){j++; 
//         // return i;
//         // if (haystack.charAt(i)==needle.charAt(j)&&
//         // haystack.charAt(i+k)==needle.charAt(j+k)){j++; return i;
//         //  break;
//          }
//         //  return i;
//         // break//not continue 
//         // 



// ye kyu galat h  for(int i=0;i<=haystack.length()-needle.length();i++)

class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        int k=needle.length()-1;

        for(int i=0;i<haystack.length();i++){
            if (haystack.charAt(i)==needle.charAt(j)){
                if(j==k){
                    return i-k;
                }
                j++;
                }

                else{
                    i=i-j;
                    j=0;
                    }
                
                
               
            }
       


        // else 
        return -1;
        
    }
}

// 2strings di haystac aur needle , btana h ki kon se haystak ke index pr needle first time occur kre ga agar nhi exist krta h then return -1

// ( ) ➡️ Expressions group karne aur methods (charAt()) ke liye.

// [ ] ➡️ Sirf Array ki indexing (arr[0]) ke liye.

// { } ➡️ Code blocks (class, if, for ki body) banane ke liye.÷