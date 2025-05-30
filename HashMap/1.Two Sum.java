
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> m1=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        m1.put(nums[i],i);
       }

       for(int i=0;i<nums.length;i++){
        int temp=target-nums[i];
        if(m1.containsKey(temp) && m1.get(temp)!=i){
            return new int[]{i,m1.get(temp)};
        }
       }
       return new int[]{};

    }
}
