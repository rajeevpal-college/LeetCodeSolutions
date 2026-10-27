// kis algorithm type of number ki tarah concept h
// numbers ?palindrome ?armstrong(diti power num sum) ?perfect(factors )?


class Solution {
    public int climbStairs(int n) {
        // if(n>=4){
        // // int sum =(n-1)+(n-2);
        //  int sum =(2n;


        // return sum;
        // }
        // else if (n==1||n==2){ return n;}
        // else return n;

        if(n<=3){
            return n;
        }

        int prev2=2;
        int prev1=3;
        int current=0;

        for(int i=4;i<=n;i++){
            current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
}


// class Solution {
//     public int climbStairs(int n) {
//         return n;
        
//     }
// }


// Aapke pichle code mein int sum = (n - 1) + (n - 2); likha tha. Jab $n = 5$ tha, toh wo seedha numbers ko jod kar $4 + 3 = 7$ de raha tha. Lekin humein stair numbers ($4$ aur $3$) ko nahi jodna tha—humein Stair 4 tak pahunchne ke ways (5) aur Stair 3 tak pahunchne ke ways (3) ko jodna tha ($5 + 3 = 8$).

// 2 fibpnacci series 



