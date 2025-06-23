class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        if(s.length()==0) return true;
        char[] s1=s.toCharArray();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s1[a]){
                a++;
                if(a>=s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
