class Solution {
    public void moveZeroes(int[] nums) {
        int a=0;
        for(int i:nums){
            if(i!=0){
                nums[a++]=i;
            }
        }
        while(a<nums.length){
            nums[a++]=0;
        }
    }
}
