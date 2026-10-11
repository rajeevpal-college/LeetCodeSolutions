// .split (" ") .length() vs .length
//HashMap<String,Character> name=new HashMap<>();
//HashMap<character,string> nextName=new HashMap<>();
//.charAt(i) name.get.equal  name.containKey    .get       .put



//if no of chr in pattern not match no of words it no match
//check if chr is already mapped to word 
// check if word is already mapped to char
//establishe bijective mapping

class Solution {
    public boolean wordPattern(String pattern, String s) {
//s ko space ke hisab se word ki array banao
        String[] words=s.split(" ");
//agr patter aur word array ki length alag h ,
//1to1 mapping not possible

        if(pattern.length()!=words.length){
            return false;
        }
//2hasmap banae,pehla charToWord :char ko word
//dusra wordToChar=  word ko char se map kre ga
//        
        HashMap<Character,String> charToWord= new HashMap<>();
        HashMap<String,Character>wordToChar= new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=words[i];
        //}
//check if char is mapped with word already        
        if(charToWord.containsKey(c)&&!charToWord.get(c).equals(w)){
            return false;
        }
//checdk if word is mapped with char already
        if(wordToChar.containsKey(w)&&wordToChar.get(w)!=c){
            return false;
        }
//agar dono sahi h to dono ki mappinf hash map mei save kr do
        charToWord.put(c,w);
        wordToChar.put(w,c);
    }
        return true;
    }
}