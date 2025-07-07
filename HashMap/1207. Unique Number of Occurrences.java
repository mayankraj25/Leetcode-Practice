class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i:arr){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        Set<Integer> s1=new HashSet<>();
        for(int i:arr){
            s1.add(i);
        }
        List<Integer> l1=new ArrayList<>(s1);

        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l1.size();j++){
                if(i!=j){
                    if(m1.get(l1.get(i)).equals(m1.get(l1.get(j)))) return false;
                }
            }
        }
        return true;
    }
}
