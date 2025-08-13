class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1=new Stack<>();
        for(String c:tokens){
            if(c.equals("+")){
                s1.push(s1.pop()+s1.pop());
            }
            else if(c.equals("-")){
                int second=s1.pop();
                int first=s1.pop();
                s1.push(first-second);
            }
            else if(c.equals("*")){
                s1.push(s1.pop()*s1.pop());
            }
            else if(c.equals("/")){
                int second=s1.pop();
                int first=s1.pop();
                s1.push(first/second);
            }
            else{
                s1.push(Integer.parseInt(c));
            }

        }
        return s1.peek();
    }
}
