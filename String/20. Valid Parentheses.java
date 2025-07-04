class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        char[] ss=s.toCharArray();
        s1.push(ss[0]);
        for(int i=1;i<s.length();i++){
            
            if(ss[i]=='(' || ss[i]=='{' || ss[i]=='['){
                s1.push(ss[i]);
            }
            else{
                if(!s1.isEmpty() && ss[i]==')' && s1.peek()=='(' ){
                    s1.pop();
                }
                else if(!s1.isEmpty() && ss[i]=='}' && s1.peek()=='{'){
                    s1.pop();
                }
                else if(!s1.isEmpty() && ss[i]==']' && s1.peek()=='['){
                    s1.pop();
                }
                else{
                    s1.push(ss[i]);
                }
            }
        }
        return s1.isEmpty();
    }
}
