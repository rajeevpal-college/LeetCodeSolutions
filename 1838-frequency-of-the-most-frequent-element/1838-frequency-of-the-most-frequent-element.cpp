class Solution
{
public:
    int maxFrequency(vector<int>& nums, int k)
    {

     //1 sort array
     //2 group elelment 
     //3 diff of sum after increament and before increament should be less than  equal to k   
     


     //  int n=sizeof(nums[]) //wrong syntax
     //  int prev=nums[0];
     //  int next=nums[1];
     //  int tempt;
     //   for(int i=0;i<n;i++) //TLE error constrain
    //   {
    //     if(prev>next)
    //     {
    //         temp=next;
    //         next=prev;
    //         prev=temp;

    //     }
    //   } 
//stp1
       int n=nums.size(); //function braces
      //incpp //not sizeof(nums[]);
      sort(nums.begin(),nums.end());

//stp2.1 pointer setup
     int left=0; //1int 2 value de kr define declare nhi kr skatey 
     int right=0;
     int maxFreq=0;
     long long sum=0; 
//stp2.2 window expand +difference sum logic in single loop
     //for (int i=0;i<n;i++) //i ki jgh trigh wrna array se bahar element le kr overflow
     for (right=0;right<n;right++)  //n-1 times loop chalne k liye <n , not <n-1
     { //loop ek less in array
        { //i = right;
         // right =right+1;  double inreament ho rha h 

         //sum=nums[right]; old sum vanish
         sum+=nums[right];

         }
 //stp2.3 differenc sum logic and 1LL concept 
           //multiplication se pehle 1LL to stop overflow and garbage 
          long long total_target= 1LL*(right-left+1)*nums[right]; //worst case overflo 2x10^9 long long use not int
          long long operation =total_target-sum;  
        

 //stp2.4 window shrink 
 //error pehley left badh rha fir value sum se minus 
 //we need agar if cond sahi to pehle left value sum se hte fir left badhey
            //   if (operation >k){ //if ki jgh while loop for multiple removing
            //       left++;
            //      // sum-=left; //sum se index nhi value -minus krni h
            //       sum-=nums[left];

            while (operation >k){
                  
                 // sum-=left; //sum se index nhi value -minus krni h
                  sum-=nums[left];
                  left++;
                  long long total_target=1LL*(right-left+1)*nums[right];
                  operation=total_target-sum;


              }
              int current_window_size=right-left+1;
              
              if(current_window_size>maxFreq){
                maxFreq=current_window_size;
              }
                  
    }

    //return 0;
    return maxFreq;  //max frequency, not element 
    }
};