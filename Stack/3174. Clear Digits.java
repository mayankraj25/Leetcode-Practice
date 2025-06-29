class Solution {
    public String clearDigits(String s) {
        Stack<Character> s1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetter(i)){
                s1.push(i);
            }
            else{
                s1.pop();
            }
        }
        for(char i:s1){
            sb.append(i);
        }
        return sb.toString();
    }
}
