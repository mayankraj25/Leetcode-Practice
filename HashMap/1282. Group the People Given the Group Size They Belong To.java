class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> m1=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            m1.putIfAbsent(size,new ArrayList<>());
            m1.get(size).add(i);

            if(m1.get(size).size()==size){
                ans.add(new ArrayList<>(m1.get(size)));
                m1.get(size).clear();
            }
        }
        return ans;  
    }
}
