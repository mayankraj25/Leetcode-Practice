class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> m1 =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m1.put(nums[i],i);
        }
        for(int i=0;i<=nums.length;i++){
            if (!m1.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}
