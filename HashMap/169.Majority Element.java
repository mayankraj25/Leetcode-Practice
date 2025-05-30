class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int i:nums){
            m1.put(i,m1.getOrDefault(i,0)+1);
            if(m1.get(i)>n){
                return i;
            }
        }
        return 0;
    }
}
