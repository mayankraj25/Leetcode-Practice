class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] temp=new int[101];
        for(int i:nums){
            count+=temp[i]++;
        }
        return count;
    }
}
