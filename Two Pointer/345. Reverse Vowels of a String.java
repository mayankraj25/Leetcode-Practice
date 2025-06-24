class Solution {
    private static boolean isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char v : vowels) {
            if (ch == v) return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] s1=s.toCharArray();
        int a=0;
        int b=s.length()-1;
        while(a<b){
            while(a<b && !isVowel(s1[a])) a++;
            while(a<b && !isVowel(s1[b])) b--;
            char temp=s1[a];
            s1[a]=s1[b];
            s1[b]=temp;
            a++;
            b--;
        }
        return new String(s1);
    }
}
