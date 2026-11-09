//sum kitne digit tak Krna h
//loop kaha taq chalane h loop ki condition
//why return sum; wrong 
class Solution {
    public int addDigits(int num) {
        int digit=0, sum=0;
        
        while(num>=10){
            sum=0;
        while (num>0){
            digit=num%10;
            num=num/10;
            sum=sum+digit;
  //          if (num==0){ num=sum;}
        }
        num=sum;
        }
        return num;
    }
}
//jab taq