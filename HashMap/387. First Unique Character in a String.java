class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(m1.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
