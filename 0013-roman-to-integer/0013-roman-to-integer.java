//size of string k liye sizeof nhi length nhi .length()
//string ke element access krney k liye. charAt(index) 
//character ko hmesha quotes m likhey h
// class Solution {
//     public int romanToInt(String S) {
//         int n=S.length();
//         char s;
//         int val=0;
//         for(int i=0;i<n;i++){
//             s=S.charAt(i);
//             if (s =='I') val+=1;
//              else if (s=='V') val+=5;
//              else if (s =='X')val+=10;
//              else if (s=='L')val+=50;
//              else if (s=='C')     val+=100;
//              else if (s=='D')  val+=500;
//              else if (s=='M')val+=1000;  


//             //  if (s =='I') val+=1;
//              else if (s=='V' ) val+=5;
//              else if (s =='X')val+=10;
//              else if (s=='L')val+=50;
//              else if (s=='C')     val+=100;
//              else if (s=='D')  val+=500;
//              else if (s=='M')val+=1000;               
//                   }
//                   return val;  
//     }
// }


class Solution {
    // Character ki value return karne ke liye helper function
    private int getValue(char s) {
        if (s == 'I') return 1;
        else if (s == 'V') return 5;
        else if (s == 'X') return 10;
        else if (s == 'L') return 50;
        else if (s == 'C') return 100;
        else if (s == 'D') return 500;
        else if (s == 'M') return 1000;
        return 0;
    }

    public int romanToInt(String S) {
        int n = S.length();
        int val = 0;

        for (int i = 0; i < n; i++) {
            int currentVal = getValue(S.charAt(i));

            // Check karein ki agla character exist karta hai ya nahi, aur kya uski value current se zyada hai
            if (i < n - 1 && currentVal < getValue(S.charAt(i + 1))) {
                val -= currentVal; // Subtraction condition (e.g., IV mein I subtract hoga)
            } else {
                val += currentVal; // Normal addition condition
            }
        }
        return val;
    }
}