class Solution {
    public int findCenter(int[][] edges) {
        int ans=edges[0][0];
        int i=1;
        while(i<edges.length){
            if(edges[i][0]==ans || edges[i][1]==ans){
                i++;
            }
            else{
                return edges[0][1];
            }
        }
        return ans;
    }
}
