class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m1=new HashMap<>();
        for(String s:strs){
            char[] c1=s.toCharArray();
            Arrays.sort(c1);
            String key=new String(c1);
            if(!m1.containsKey(key)){
                m1.put(key,new ArrayList<>());
            }
            m1.get(key).add(s);
        }
        return new ArrayList<>(m1.values());
    }
}
