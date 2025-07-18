class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int presum=0,res=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            presum+=satisfaction[i];
            if(presum<0){
                break;
            }
            res+=presum;
        }
        return res;
    }
}
