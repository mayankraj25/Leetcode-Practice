class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i!=j){
            if(nums[i]+nums[j]==k){
                if(j!=i+1){
                    count++;
                    i++;
                    j--;
                }
                else{
                    count++;
                    i++;
                }
            } 
            else if(nums[i]+nums[j]>k) j--;
            else{
                i++;
            }
        }
        return count; 
    }
}
