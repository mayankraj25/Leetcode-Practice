class Solution {
    public String smallestNumber(String pattern) {
       Stack<Integer> s1=new Stack<>();
       StringBuilder sb= new StringBuilder();
       for(int i=1;i<=pattern.length();i++){
        if(pattern.charAt(i-1)=='I'){
            sb.append(i);
            while(!s1.isEmpty()){
                sb.append(s1.peek());
                s1.pop();
            }
        }
        else if(pattern.charAt(i-1)=='D'){
            s1.push(i);
        }
       }
       s1.push(pattern.length()+1);
        while(!s1.isEmpty()){
                sb.append(s1.peek());
                s1.pop();
            }
       return sb.toString();
    }
}
