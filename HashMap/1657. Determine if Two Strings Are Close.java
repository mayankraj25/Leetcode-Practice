class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        int[] l1=new int[word1.length()];
        int[] l2=new int[word1.length()];
        char[] s1=word1.toCharArray();
        char[] s2=word2.toCharArray();
        for(char i:s1){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        for(char i:s2){
            m2.put(i,m2.getOrDefault(i,0)+1);
        }
        if(m1.size()!=m2.size())return false;
        for(char i:m1.keySet()){
            if(!m2.containsKey(i)) return false;
        }
        int a=0,b=0;
        for(int i:m1.values()){
            l1[a]=i;
            a++;
        }
        for(int i:m2.values()){
            l2[b]=i;
            b++;
        }
        Arrays.sort(l1);
        Arrays.sort(l2);
        for(int i=0;i<word1.length();i++){
            if(l1[i]!=l2[i]) return false;
        }
        return true;
        
    }
}
