// without sqroot , sqrt

// number ko n/2 taq divide kro loop lagag k fir check kro iska product number k barabar to nhi
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;

        // for (int i=1;i<=num/2;i++){
        // for (int i=1;i*i<=num;i++){
        for (long i=1;i*i<=num;i++){




        if(i*i==num)return true;
        }
        return false ;
        
    }
}