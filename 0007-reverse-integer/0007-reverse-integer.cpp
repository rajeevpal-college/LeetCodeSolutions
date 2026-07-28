class Solution {
public:
 
    //int reverse(int x) {
    long long reverse(long long x){
        if(x<pow(-2,31)||x>pow(2,31)-1){return 0;}
        else{
       // int rnum=0;
       long long rnum=0;
        int rem=0;
        //int n=x;
        long long n=x;
        // for(int i=0;i<=x;i++){ // x ka value kam ho rha h
        //for(int i=0;i<=n;i++){
        if (x<0){n=x*(-1);}
      //  while(x>0||x<0){
        while(n>0){



           rem= x%10;
            x=x/10;
            if(rnum>INT_MAX/10||rnum<INT_MIN/10){
                return 0;
            }
            else
            rnum=rnum*10+rem;
            n=n/10;

        }
        //cout << rnum;
       // return 0;
       return rnum;
    }
    }
};