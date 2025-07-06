class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Boolean> h1= new HashMap<>();
        int ans=0;
        for(int i=0;i<allowed.length();i++){
            h1.put(allowed.charAt(i),true);
        }
        for(int i=0;i<words.length;i++){
            int count=0;
            for(int j=0;j<words[i].length();j++){
                if(h1.containsKey(words[i].charAt(j))){
                    count++;
                }
            }
            if(count==words[i].length()) ans++;
        }
        return ans;
    }
}
