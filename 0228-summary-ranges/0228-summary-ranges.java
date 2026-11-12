// List kese create krtey h 
// ArrayIndexOutOfBoundsException error
//string builder se sting kese banate h? append,add
// result.add(sb.toString());
// StringBuilder vs String

// result.add(sb); likhoge, toh Java error dega (incompatible types: StringBuilder cannot be converted to String

// .toString() use 

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result=new ArrayList<>();

        int n=nums.length;
        for (int i=0;i<n;i++){
            int start=nums[i];
//next number consecutive ki cond'n
            while(i+1<n && nums[i+1]==nums[i]+1){
                i++;
            
        }
        // Simple '+' wala tareeka (Samajhne mein aasan, bas 5-6ms leta hai)
        if (start != nums[i]) {
             result.add(start + "->" + nums[i]);
            } else {
    result.add(String.valueOf(start)); // int ko String bana ke daala
    }
        //  StringBuilder sb = new StringBuilder();
        //     sb.append(start);
        //     if (start != nums[i]) {
        //         sb.append("->").append(nums[i]);
        //     }
        //     result.add(sb.toString());
        }
        
        return result;
    }
}

// int start =nums[i];
// while(i+1<n && nums[i+1]==nums[i]+1){
//     i++;
// }
// start+"->" +nums[i]


// 2loop lage gi 