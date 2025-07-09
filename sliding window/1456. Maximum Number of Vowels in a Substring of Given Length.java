class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i-k))) count--;
            if(count>max) max=count;
        }
        return max;
    }
    private Boolean isVowel(char c){
        if("aeiou".indexOf(c)!=-1){
            return true;
        }
        return false;
    }
}
