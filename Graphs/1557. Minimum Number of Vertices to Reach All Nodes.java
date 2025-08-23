class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] l1=new int[n];
        for(List<Integer> edge: edges){
            l1[edge.get(1)]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(l1[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}
