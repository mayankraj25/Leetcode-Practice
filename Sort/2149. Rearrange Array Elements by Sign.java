class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a=0;
        int b=0;
        int[] positive=new int[nums.length/2];
        int[] negetive=new int[nums.length/2];
        for(int i:nums){
            if(i>=0){
                positive[a]=i;
                a++;
            }
            else{
                negetive[b]=i;
                b++;
            }
        }
        a=0;
        b=0;
        for(int i=0;i<nums.length;i+=2){
            nums[i]=positive[a];
            a++;
            nums[i+1]=negetive[b];
            b++;
        }
        return nums;
    }
}
