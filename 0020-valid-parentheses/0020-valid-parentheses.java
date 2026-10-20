class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);

        if(c=='('){
            stack.push(')');

        }
        else if(c =='{'){
            stack.push('}');

        }
        else if(c=='['){
            stack.push(']');

        }
        else{
            if(stack.isEmpty()||stack.pop() !=c ) {
                return false;
            }
        }
        }
        return stack.isEmpty();
    

        
    }
}

// 1ek stack character store krney k liye 
// 2 java m s[i] nhi s.charat(i) s.charAt(i);
// 3 jab opening bracket mile to stack m closing bracket dal do
// 4bcz hmey pta chal kis bracket closing ka wait kr rhey h 
// 5agar current bracket opeinign nhi h to vo closing bracket hoga
// 6
// fale condition check kro
// 1 stack.is EMpty closing bracket aa gaya pr stack khali h opening bracket aaya hi nhi tha
// 2stack.pop()!=cstack ke pop ,se C match nhi kra 
// false return 
 
