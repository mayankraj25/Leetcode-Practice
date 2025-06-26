class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;
        while(i!=nums.length){
            int sum1=0;
            int sum2=0;
            int a=0;
            int b=i+1;
            if(i==0) sum1=0;
            else if(i!=0){
                while(a!=i){
                    sum1+=nums[a];
                    a++;
                }
            }
            if(i==nums.length-1) sum2=0;
            else if(i!=nums.length-1){
                while(b!=nums.length){
                    sum2+=nums[b];
                    b++;
                }
            }
            
            if(sum1==sum2) return i;
            i++;
        }
        return -1;
    }
}
