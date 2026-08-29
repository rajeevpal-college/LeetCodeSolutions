// class Solution {
// public:
//     int maxProfit(vector<int>& prices) {
//         //difference jisme jyada aaye vo print kr do like 3 loop 
//         //1 loop se pehla then dusrey se dursa baki se compare kre ga
//         //
//         int profit,highestprofit =0;
//         //n=sizeof(prices) //in c lang
//         int n=prices.size();
//         for(int i=0;i<n;i++){

//             for(int j=i;j<n;j++){
//                profit= prices[j]-prices[i];
//                if(highestprofit<profit){
//                 highestprofit=profit;

//                }
//             }
//         }
//         return highestprofit;
        
//     }
// };


//ek loop m krna pade ga 

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        //difference jisme jyada aaye vo print kr do like 3 loop 
        //1 loop se pehla then dusrey se dursa baki se compare kre ga
        //
        int profit,highestprofit =0;
        //n=sizeof(prices) //in c lang
        int n=prices.size();
        int i=0;
        
        // int leastBuy=0;//error dega max ka 
        int leastBuy=prices[0];

        for(int i=0;i<n;i++){
            if (prices[i]<leastBuy){
                leastBuy=prices[i];
            }
            profit=prices[i]-leastBuy;
            if (profit>highestprofit){
                highestprofit=profit;

            }

        
    }
    return highestprofit;
    }
};