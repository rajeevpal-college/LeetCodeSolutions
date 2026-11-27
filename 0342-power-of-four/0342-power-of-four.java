// repeated division kro float m ? agar non integer return non zero ?

// repeated division kro 4 se count++ krtey jao and if 4raise power count n k barabar aa jaye to true else false ??

// power kese krtey h java m ?
        // while (num>0){

        // while (num>1){

class Solution {
    public boolean isPowerOfFour(int n) {
        int num= n;
        int power=0;
        while (num>=4){
            num=num/4;
            power++;

        }
        if (Math.pow(4,power)==n) return true; 
        else return false ;

        
    }
}