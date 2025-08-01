class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int min_val=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                if((right-left)+1<min_val) min_val=(right-left)+1;
                sum-=nums[left];
                left++;
            }
        }
        return min_val!=Integer.MAX_VALUE?min_val:0;
    }
}
