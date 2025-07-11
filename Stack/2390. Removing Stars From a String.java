class Solution {
    public String removeStars(String s) {
        Stack<Character> s1=new Stack<>();
        StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                s1.pop();
            }
            else{
                s1.push(s.charAt(i));
            }
       }
       for(char i:s1){
        sb.append(i);
       }
       return sb.toString();
    }
}
