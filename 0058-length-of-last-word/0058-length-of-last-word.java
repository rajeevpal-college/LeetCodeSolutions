// string k last word ko count kr k output 
// 1 string m element word ya alphabets kese access krtey h 
// 2 why not string s[i] why string.characterAt(i)
// 3length function not size of 
// problem with loop this way for(int i=0;i<n-1;i++){
//why not i>n/2

class Solution {
    public int lengthOfLastWord(String s) {

        int n=s.length();
        int count=0;

        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }

            else if(count>0){
                break;
            }
        }
        return count;
    }
}

// 1space ke through like last space jhan p hoga uske bad k alphabet word form krey g usko count kre g
// 1string s , s[i]==space  s[i]!=. count ++ return count 

// pichey se loop chalaye g 