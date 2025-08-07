class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> m1=new HashMap<>();
        for(char i:s.toCharArray()){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
            if(m1.containsKey(i) && m1.get(i)>0){
                m1.put(i,m1.get(i)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
