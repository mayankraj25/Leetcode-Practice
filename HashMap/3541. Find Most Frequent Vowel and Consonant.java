class Solution {
    public int maxFreqSum(String s) {
        int max1=0;
        int max2=0;
        HashMap<Character,Integer> vowel=new HashMap<>();
        HashMap<Character,Integer> constant=new HashMap<>();
        for(char i:s.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                vowel.put(i,vowel.getOrDefault(i,0)+1);
                if(vowel.get(i)>max1) max1=vowel.get(i);
            }
            else{
                constant.put(i,constant.getOrDefault(i,0)+1);
                if(constant.get(i)>max2) max2=constant.get(i);
            }
        }
        return max1+max2;
    }
}
