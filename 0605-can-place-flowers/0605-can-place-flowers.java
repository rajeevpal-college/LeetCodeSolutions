// // 0's ki jgh flower (1) lagana h to check kro 
// 3 varibale lo left ,index right , index 
// count kro kitne ese zeroes h jinmey 3no variabel zero hongey 
// last me if condition laga k ==n kr lo true ya false 
//        for (int i=0;i<length.flowerbed-1;i++){ wrong ??

// end case condition kese ? first aur last index kese check kro g ??

// agar count jada aa gya to ??
// // array update kyu krni h ??
// only [0] ki condition m??
// [0,0] ki condition m 
// edge cases check kro



class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int left, right , index ,count=0;

        if(flowerbed.length==1){
            if (flowerbed[0]==0) count++;
            return count>=n;
        }
        if(flowerbed[0]==0&&flowerbed[1]==0){count++; flowerbed[0]=1;}

        for (int i=0;i<flowerbed.length-2;i++){
            left=flowerbed[i];
            index=flowerbed[i+1];
            right=flowerbed[i+2];

            if (left==0&&right==0&&index==0){
                count++;
                index=1;
                flowerbed[i+1]=1;
            }

           // if(left=right=index=0){count++;}

        }
        //start aur end ki condition check 
        // if(flowerbed[0]==0&&flowerbed[1]==0){count++;}

        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){count++;}

        if (count>=n){return true;}
        else return false;

    }
}