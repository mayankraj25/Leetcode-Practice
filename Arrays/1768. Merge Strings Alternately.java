class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=0;
        int b=0;
        char[] c1=word1.toCharArray();
        char[] c2=word2.toCharArray();
        StringBuilder s1=new StringBuilder();

        while(a<word1.length() && b<word2.length()){
            s1.append(c1[a]);
            a++;
            s1.append(c2[b]);
            b++;
        }
        while(a<word1.length()){
            s1.append(c1[a]);
            a++;
        }
        while(b<word2.length()){
            s1.append(c2[b]);
            b++;
        }
        return s1.toString();
    }
}
