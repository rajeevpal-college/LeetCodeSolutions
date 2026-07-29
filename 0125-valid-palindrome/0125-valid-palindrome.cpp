// class Solution {
// public:
//     bool isPalindrome(string s) {
//         string revs;
//         //appending an string
//         // 2 loop chale gi reverse krne k liye
//         //size of string , function end ()
//         int n=s.length();
//         for (int i = 0; i < n; i++) {
//                                       // revs[i] = s[n - i];
//            revs+=s[n-i-1]; //index 0 , last n-1 not n
//             if (revs == s) {
//                // cout << palindrome;
//                //boolean ka return true or false hota h
//                return true;
//             }
//             else {return false;}
//         }
//         // else //if (revs!=s){   //if loop m , bina if no else
//         //     return false;
        

//     //true aur false dono ki cndition
    
// }


class Solution {
public:
    bool isPalindrome(string s) {
        string filtered="";
        //remove non alpha numeric
      int n = s.length();
        for(int i=0;i<n;i++)  //not i <n

        if(isalnum(s[i])){
            filtered+= tolower(s[i]); //ye kya h , capital to small letter
        }
        


        string revs = ""; 
        int len=filtered.length();
        
        // 1. Pehle poori string ko reverse hone dijiye
        for (int i = 0; i < len; i++) { //not n
           revs += filtered [len - i - 1];    //not s
        }

        // 2. For loop khatam hone ke BAHAR compare kariye
        if (revs == filtered) {
            return true;  // Dekhiye maine yahan se // hata diya hai
        } else {
            return false;
        }
    }
};